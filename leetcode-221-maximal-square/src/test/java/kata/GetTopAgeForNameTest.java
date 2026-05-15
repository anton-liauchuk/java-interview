package kata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GetTopAgeForNameTest {

    private final GetTopAgeForName solution = new GetTopAgeForName();

    @Test
    public void getTopAgeForName() {
        var persons = generatePersons();

        final List<Person> result = solution.getTopAgeForName(persons);

        assertThat(result)
                .containsExactlyInAnyOrder(new Person("John", 25), new Person("Mark", 11));
    }

    private List<Person> generatePersons() {
        return List.of(new Person("John", 23), new Person("John", 25), new Person("Mark", 11));
    }
}
