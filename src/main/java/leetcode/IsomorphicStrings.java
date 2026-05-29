package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 205. Isomorphic Strings https://leetcode.com/problems/isomorphic-strings/
 *
 * <p>Given two strings s and t, determine if they are isomorphic.
 *
 * <p>Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * <p>All occurrences of a character must be replaced with another character while preserving the
 * order of characters. No two characters may map to the same character, but a character may map to
 * itself.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sToT.containsKey(c1) && sToT.get(c1) != c2) return false;
            if (tToT.containsKey(c2) && tToT.get(c2) != c1) return false;

            sToT.put(c1, c2);
            tToT.put(c2, c1);
        }

        return true;
    }
}
