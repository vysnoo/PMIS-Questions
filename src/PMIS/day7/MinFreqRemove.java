package PMIS.day7;

import java.util.HashSet;
import java.util.Set;

public class MinFreqRemove {
    public static void main(String[] args) {
        //String s = "aaabbbcc";
        String s = "ceabaacb";
        int[] freq = new int[26];

        // Step 1: Count frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Set<Integer> used = new HashSet<>();
        int deletions = 0;

        // Step 2: Make frequencies unique
        for (int f : freq) {

            while (f > 0 && used.contains(f)) {
                f--;
                deletions++;
            }

            if (f > 0) {
                used.add(f);
            }
        }

        System.out.println(deletions);
    }
}
