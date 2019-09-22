import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReferencePipeline implements Stream {

    protected ReferencePipeline previousStage;

    private List<StreamObject> objects;

    private ReferencePipeline(List<StreamObject> objects) {
        this.objects = objects;
    }

    public ReferencePipeline() {
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

    abstract class Operation extends ReferencePipeline {

        public Operation(ReferencePipeline previousStage) {
            this.previousStage = previousStage;
        }
    }

    abstract class ChainedReference implements Sink {
        protected final Sink downstream;

        public ChainedReference(Sink downstream) {
            this.downstream = Objects.requireNonNull(downstream);
        }
    }

}
