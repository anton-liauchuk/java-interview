package dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidParenthesesTest {

    private final ValidParentheses solution = new ValidParentheses();

    @Test
    void testExample1() {
        boolean result = solution.isValid("()");
        assertThat(result).isTrue();
    }

    @Test
    void testExample2() {
        boolean result = solution.isValid("()[]{}");
        assertThat(result).isTrue();
    }

    @Test
    void testExample3() {
        boolean result = solution.isValid("(]");
        assertThat(result).isFalse();
    }

    @Test
    void testExample4() {
        boolean result = solution.isValid("([])");
        assertThat(result).isTrue();
    }

    @Test
    void testExample5() {
        boolean result = solution.isValid("([)]");
        assertThat(result).isFalse();
    }
}
