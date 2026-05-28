package leetcode;

/**
 * LeetCode 2469. Convert the Temperature https://leetcode.com/problems/convert-the-temperature/
 *
 * <p>Given a non-negative floating point number celsius, return an array {@code ans = [kelvin,
 * fahrenheit]}, where {@code kelvin = celsius + 273.15} and {@code fahrenheit = celsius * 1.80 +
 * 32.00}.
 */
public class ConvertTheTemperature {

    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[] {kelvin, fahrenheit};
    }
}
