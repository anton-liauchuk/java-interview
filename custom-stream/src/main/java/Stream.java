import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Custom Stream interface with basic functions.
 * Original class is {@link java.util.stream.Stream}
 */
interface Stream {

    /**
     * Original method is {@link java.util.stream.Stream#filter(Predicate)}
     */
    Stream filter(Predicate<StreamObject> predicate);

    /**
     * Original method is {@link java.util.stream.Stream#map(Function)}
     */
    Stream map(Function<StreamObject, Integer> function);

    /**
     * Terminal operation which returns the list.
     */
    List<Object> toList();
}