package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmallestEvenMultipleTest {

    @Test
    void example1() {
        SmallestEvenMultiple solution = new SmallestEvenMultiple();
        assertEquals(10, solution.smallestEvenMultiple(5));
    }

    @Test
    void example2() {
        SmallestEvenMultiple solution = new SmallestEvenMultiple();
        assertEquals(6, solution.smallestEvenMultiple(6));
    }

    @Test
    void nEqualsOne() {
        SmallestEvenMultiple solution = new SmallestEvenMultiple();
        assertEquals(2, solution.smallestEvenMultiple(1));
    }

    @Test
    void largeOdd() {
        SmallestEvenMultiple solution = new SmallestEvenMultiple();
        assertEquals(150, solution.smallestEvenMultiple(150));
    }
}
