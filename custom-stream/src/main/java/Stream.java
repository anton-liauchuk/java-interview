import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

interface Stream {
    Stream filter(Predicate<StreamObject> predicate);
    Stream map(Function<StreamObject, Integer> function);
    List<Object> toList();
}