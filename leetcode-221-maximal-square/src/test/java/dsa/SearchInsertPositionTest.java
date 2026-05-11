package dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchInsertPositionTest {

    private final SearchInsertPosition solution = new SearchInsertPosition();

    @Test
    void testExample1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void testExample2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testExample3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(4);
    }
}
