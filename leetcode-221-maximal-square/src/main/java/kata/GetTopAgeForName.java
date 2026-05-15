package kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetTopAgeForName {

    List<Person> getTopAgeForName(List<Person> persons) {
        var result = new HashMap<String, Person>();
        for (Person person : persons) {
            if (!result.containsKey(person.name())) {
                result.put(person.name(), person);
            } else if (person.age() > result.get(person.name()).age()) {
                result.put(person.name(), person);
            }
        }

        return new ArrayList<>(result.values());
    }

}

record Person(String name, int age) {
}
