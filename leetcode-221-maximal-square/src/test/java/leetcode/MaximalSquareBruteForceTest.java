package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximalSquareBruteForceTest {

    private MaximalSquareBruteForce maximalSquareBruteForce;

    @BeforeEach
    void setUp() {
        maximalSquareBruteForce = new MaximalSquareBruteForce();
    }

    @Test
    void testLeetcodeExample1() {
        // given
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        // when
        var result = maximalSquareBruteForce.maximalSquare(matrix);

        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    void testLeetcodeExample2() {
        // given
        char[][] matrix = {
                {'0', '1'},
                {'1', '0'}
        };

        // when
        var result = maximalSquareBruteForce.maximalSquare(matrix);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testLeetcodeExample3() {
        // given
        char[][] matrix = {
                {'0'}
        };

        // when
        var result = maximalSquareBruteForce.maximalSquare(matrix);

        // then
        assertThat(result).isEqualTo(0);
    }
}
