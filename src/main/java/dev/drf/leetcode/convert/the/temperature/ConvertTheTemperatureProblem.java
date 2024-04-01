package dev.drf.leetcode.convert.the.temperature;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/convert-the-temperature/
 */
public class ConvertTheTemperatureProblem implements Problem {
    public double[] convertTemperature(double celsius) {
        // Kelvin = Celsius + 273.15
        // Fahrenheit = Celsius * 1.80 + 32.00
        // ans = [kelvin, fahrenheit]
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        return new double[] {
                kelvin, fahrenheit
        };
    }
}
