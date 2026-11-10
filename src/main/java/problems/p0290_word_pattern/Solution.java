package problems.p0290_word_pattern;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/word-pattern/">290. Word Pattern (Easy)</a>
 * <P>
 * Approach:
 * Time: , Space:
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Set<String> combinations = new HashSet<>();
        Set<String> wordSet = new HashSet<>();
        Set<Character> charSet = new HashSet<>();

        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            Character c = pattern.charAt(i);
            String word = words[i];

            boolean charExist = !charSet.add(c);
            boolean wordExist = !wordSet.add(word);
            boolean combinationExist = !combinations.add(c + word);

            if ((charExist && !wordExist) || (!charExist && wordExist) || (charExist && wordExist && !combinationExist)) {
                return false;
            }
        }

        return true;
    }
}
