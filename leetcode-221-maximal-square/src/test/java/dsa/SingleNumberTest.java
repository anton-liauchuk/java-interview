package dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleNumberTest {

    private final SingleNumber solution = new SingleNumber();

    @Test
    void testExample1() {
        int result = solution.singleNumber(new int[]{2, 2, 1});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testExample2() {
        int result = solution.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertThat(result).isEqualTo(4);
    }

    @Test
    void testExample3() {
        int result = solution.singleNumber(new int[]{1});
        assertThat(result).isEqualTo(1);
    }
}
