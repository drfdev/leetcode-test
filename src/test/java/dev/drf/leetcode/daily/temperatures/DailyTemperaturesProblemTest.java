package dev.drf.leetcode.daily.temperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DailyTemperaturesProblemTest {
    private final DailyTemperaturesProblem problem = new DailyTemperaturesProblem();

    private void assertArray(int[] result, int... values) {
        assertEquals(values.length, result.length);

        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], result[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: temperatures = [73,74,75,71,69,72,76,73]
        Output: [1,1,4,2,1,1,0,0]
         */
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};

        var result = problem.dailyTemperatures(temperatures);

        assertArray(result, 1, 1, 4, 2, 1, 1, 0, 0);
    }

    @Test
    void example2() {
        /*
        Input: temperatures = [30,40,50,60]
        Output: [1,1,1,0]
         */
        int[] temperatures = new int[]{30, 40, 50, 60};

        var result = problem.dailyTemperatures(temperatures);

        assertArray(result, 1, 1, 1, 0);
    }

    @Test
    void example3() {
        /*
        Input: temperatures = [30,60,90]
        Output: [1,1,0]
         */
        int[] temperatures = new int[]{30, 60, 90};

        var result = problem.dailyTemperatures(temperatures);

        assertArray(result, 1, 1, 0);
    }
}
