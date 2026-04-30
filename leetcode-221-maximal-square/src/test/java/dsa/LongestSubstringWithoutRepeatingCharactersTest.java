package dsa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void testLongestSubstringWithoutRepeatingCharactersExample1() {
        // given
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // when
        int result = solution.lengthOfLongestSubstring("abcabcbb");

        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void testLongestSubstringWithoutRepeatingCharactersExample2() {
        // given
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // when
        int result = solution.lengthOfLongestSubstring("bbbbb");

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testLongestSubstringWithoutRepeatingCharactersExample3() {
        // given
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // when
        int result = solution.lengthOfLongestSubstring("pwwkew");

        // then
        assertThat(result).isEqualTo(3);
    }

}
