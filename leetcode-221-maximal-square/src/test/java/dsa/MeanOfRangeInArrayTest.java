package dsa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MeanOfRangeInArrayTest {

    @Test
    void testMeanOfRangeInArrayExample1() {
        // given
        MeanOfRangeInArray meanOfRangeInArray = new MeanOfRangeInArray();

        // when
        ArrayList<Integer> result = meanOfRangeInArray.findMean(new int[]{1, 2, 3, 4, 5}, new int[][]{{0, 2}, {1, 3}, {0, 4}});

        // then
        assertThat(result).isEqualTo(List.of(2, 3, 3));
    }

    @Test
    void testMeanOfRangeInArrayExample2() {
        // given
        MeanOfRangeInArray meanOfRangeInArray = new MeanOfRangeInArray();

        // when
        ArrayList<Integer> result = meanOfRangeInArray.findMean(new int[]{6, 7, 8, 10}, new int[][]{{0, 3}, {1, 2}});

        // then
        assertThat(result).isEqualTo(List.of(7, 7));
    }
}
