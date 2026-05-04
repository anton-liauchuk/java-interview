package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length(), n = s.length();
        List<Integer> result = new ArrayList<>();
        int[] countP = new int[26], countTW = new int[26];

        for (int i = 0; i < m; i++) {
            countP[p.charAt(i) - 'a']++;
            countTW[s.charAt(i) - 'a']++;
        }

        for (int i = m; i < n; i++) {
            if (Arrays.equals(countP, countTW)) {
                result.add(i - m);
            }
            countTW[s.charAt(i) - 'a']++;
            countTW[s.charAt(i - m) - 'a']--;
        }

        if (Arrays.equals(countP, countTW)) {
            result.add(n - m);
        }

        return result;
    }
}
