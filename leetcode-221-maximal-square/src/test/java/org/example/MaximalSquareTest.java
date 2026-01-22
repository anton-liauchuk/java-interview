package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximalSquareTest {

    @Test
    void testExample1() {
        // given
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        var solution = new Solution();

        // when
        var result = solution.maximalSquare(matrix);

        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    void test2x2Square() {
        // given
        char[][] matrix = {
                {'0', '1'},
                {'1', '0'}
        };
        var solution = new Solution();

        // when
        var result = solution.maximalSquare(matrix);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test0() {
        // given
        char[][] matrix = {
                {'0'}
        };
        Solution solution = new Solution();

        // when
        var result = solution.maximalSquare(matrix);

        // then
        assertThat(result).isEqualTo(0);
    }
}
