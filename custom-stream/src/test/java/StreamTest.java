import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    public void debugStream() {
        StreamObject object0 = new StreamObject();
        object0.setId(0);
        object0.setName("0");

        StreamObject object1 = new StreamObject();
        object1.setId(1);
        object1.setName("1");

        List<StreamObject> collection = Arrays.asList(object0, object1);
//        final List<Integer> collect = collection.stream()
//                .filter(streamObject -> streamObject.getId() == 0)
//                .map(StreamObject::getId)
//                .collect(Collectors.toList());

        ReferencePipeline.of(collection)
                .filter(streamObject -> streamObject.getId() == 0)
                .map(StreamObject::getId)
                .toList();
    }

}
