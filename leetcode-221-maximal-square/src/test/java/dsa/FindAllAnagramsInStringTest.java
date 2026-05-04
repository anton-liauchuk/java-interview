package dsa;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindAllAnagramsInStringTest {

    @Test
    void testFindAllAnagramsInStringExample1() {
        // given
        FindAllAnagramsInString solution = new FindAllAnagramsInString();

        // when
        List<Integer> result = solution.findAnagrams("cbaebabacd", "abc");

        // then
        assertThat(result).containsExactly(0, 6);
    }

    @Test
    void testFindAllAnagramsInStringExample2() {
        // given
        FindAllAnagramsInString solution = new FindAllAnagramsInString();

        // when
        List<Integer> result = solution.findAnagrams("abab", "ab");

        // then
        assertThat(result).containsExactly(0, 1, 2);
    }
}
