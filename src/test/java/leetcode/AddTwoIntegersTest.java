package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTwoIntegersTest {

    @Test
    void example1() {
        AddTwoIntegers solution = new AddTwoIntegers();
        assertEquals(17, solution.sum(12, 5));
    }

    @Test
    void example2() {
        AddTwoIntegers solution = new AddTwoIntegers();
        assertEquals(-6, solution.sum(-10, 4));
    }

    @Test
    void bothZero() {
        AddTwoIntegers solution = new AddTwoIntegers();
        assertEquals(0, solution.sum(0, 0));
    }

    @Test
    void bothNegative() {
        AddTwoIntegers solution = new AddTwoIntegers();
        assertEquals(-7, solution.sum(-3, -4));
    }
}
