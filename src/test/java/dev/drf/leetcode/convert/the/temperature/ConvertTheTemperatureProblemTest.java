package dev.drf.leetcode.convert.the.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertTheTemperatureProblemTest {
    private final ConvertTheTemperatureProblem problem = new ConvertTheTemperatureProblem();

    @Test
    void example1() {
        /*
        Input: celsius = 36.50
        Output: [309.65000,97.70000]
         */
        double celsius = 36.50;

        var ans = problem.convertTemperature(celsius);

        assertEquals(309.65000, ans[0]);
        assertEquals(97.70000, ans[1]);
    }

    @Test
    void example2() {
        /*
        Input: celsius = 122.11
        Output: [395.26000,251.79800]
         */
        double celsius = 122.11;

        var ans = problem.convertTemperature(celsius);

        assertEquals(395.26000, ans[0]);
        assertEquals(251.79800, ans[1]);
    }
}
