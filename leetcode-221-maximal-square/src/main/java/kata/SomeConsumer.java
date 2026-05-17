package kata;

import java.util.List;
import java.util.stream.Stream;

class SomeConsumer {
    public List<User> consume(Stream<User> usersStream) {
        return usersStream
                .filter(user -> user.groups().stream()
                        .anyMatch(group -> group.name().startsWith("x")))
                .toList();
    }
}

record User(String username, Integer age, List<Group> groups) {
}

record Group(String name, String description) {
}
