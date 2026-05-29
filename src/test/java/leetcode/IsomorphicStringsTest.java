package leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {

    @Test
    void example1() {
        IsomorphicStrings solution = new IsomorphicStrings();
        assertTrue(solution.isIsomorphic("egg", "add"));
    }

    @Test
    void example2() {
        IsomorphicStrings solution = new IsomorphicStrings();
        assertFalse(solution.isIsomorphic("foo", "bar"));
    }

    @Test
    void example3() {
        IsomorphicStrings solution = new IsomorphicStrings();
        assertTrue(solution.isIsomorphic("paper", "title"));
    }

    @Test
    void twoMapToSameTarget() {
        IsomorphicStrings solution = new IsomorphicStrings();
        assertFalse(solution.isIsomorphic("badc", "baba"));
    }

    @Test
    void differentCharsMapToSameTarget() {
        IsomorphicStrings solution = new IsomorphicStrings();
        assertFalse(solution.isIsomorphic("ab", "aa"));
    }

    @Test
    void singleCharacter() {
        IsomorphicStrings solution = new IsomorphicStrings();
        assertTrue(solution.isIsomorphic("a", "a"));
    }
}
