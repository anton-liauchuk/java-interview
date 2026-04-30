package dsa;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s.length();
        }

        int result = 0;
        boolean[] visited = new boolean[26];

        int left = 0, right = 0;
        while (right < s.length()) {

            while (visited[s.charAt(right) - 'a']) {
                visited[s.charAt(left) - 'a'] = false;
                left++;
            }

            visited[s.charAt(right) - 'a'] = true;
            result = Math.max(result, (right - left + 1));
            right++;
        }
        return result;
    }
}
