package dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveZeroesTest {

    private final MoveZeroes solution = new MoveZeroes();

    @Test
    void testExample1() {
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertThat(nums).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    void testExample2() {
        int[] nums = {0};
        solution.moveZeroes(nums);
        assertThat(nums).containsExactly(0);
    }
}
