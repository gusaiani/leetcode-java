package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ConvertTheTemperatureTest {

    @Test
    void example1() {
        ConvertTheTemperature solution = new ConvertTheTemperature();
        double[] expected = {310.15, 98.60};
        double[] result = solution.convertTemperature(37.0);
        assertArrayEquals(expected, result, 1e-5);
    }

    @Test
    void example2() {
        ConvertTheTemperature solution = new ConvertTheTemperature();
        double[] expected = {273.15, 32.00};
        double[] result = solution.convertTemperature(0.0);
        assertArrayEquals(expected, result, 1e-5);
    }

    @Test
    void negativeCelsius() {
        ConvertTheTemperature solution = new ConvertTheTemperature();
        double[] expected = {263.65, 14.90};
        double[] result = solution.convertTemperature(-9.5);
        assertArrayEquals(expected, result, 1e-5);
    }
}
