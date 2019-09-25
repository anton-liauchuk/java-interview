import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Custom reference pipeline implementation with basic functions.
 * The original class is {@link java.util.stream.ReferencePipeline}
 */
public class ReferencePipeline implements Stream {

    ReferencePipeline previousStage;

    private List<StreamObject> objects;

    private ReferencePipeline(List<StreamObject> objects) {
        this.objects = objects;
    }

    ReferencePipeline() {
    }

    public Sink opWrapSink(Sink sink) {
        throw new UnsupportedOperationException();
    }

    public static ReferencePipeline of(List<StreamObject> objects) {
        return new ReferencePipeline(objects);
    }

    public Stream filter(Predicate<StreamObject> predicate) {
        return new Operation(this) {
            @Override
            public Sink opWrapSink(Sink sink) {
                return new ChainedReference(sink) {

                    @Override
                    public void accept(Object o) {
                        if (predicate.test((StreamObject) o))
                            downstream.accept(o);
                    }
                };
            }
        };
    }

    public Stream map(Function function) {
        return new Operation(this) {
            @Override
            public Sink opWrapSink(Sink sink) {
                return new ChainedReference(sink) {

                    @Override
                    public void accept(Object o) {
                        downstream.accept(function.apply(o));
                    }
                };
            }
        };
    }

    public List<Object> toList() {
        final List<Object> result = new ArrayList<>();

        Sink finalSink = o -> result.add(o);

        ReferencePipeline previousStage = this;
        Sink sink = finalSink;

        while (previousStage.previousStage != null) {
            sink = previousStage.opWrapSink(sink);
            previousStage = previousStage.previousStage;
        }

        for (StreamObject object : previousStage.objects) {
            sink.accept(object);
        }

        return result;
    }

    /**
     * Represents Operation which has the info about previous stage.
     */
    abstract class Operation extends ReferencePipeline {

        Operation(ReferencePipeline previousStage) {
            this.previousStage = previousStage;
        }
    }

    /**
     * Represents Chained Reference which has the link to downstream.
     */
    abstract class ChainedReference implements Sink {
        final Sink downstream;

        ChainedReference(Sink downstream) {
            this.downstream = Objects.requireNonNull(downstream);
        }
    }

}
