package dev.drf.leetcode.traffic.signal.color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficSignalColorProblemTest {
    private final TrafficSignalColorProblem problem = new TrafficSignalColorProblem();

    @Test
    void example1() {
        // Input: timer = 60
        // Output: "Red"
        int timer = 60;

        var result = problem.trafficSignal(timer);

        assertEquals("Red", result);
    }

    @Test
    void example2() {
        // Input: timer = 5
        // Output: "Invalid"
        int timer = 5;

        var result = problem.trafficSignal(timer);

        assertEquals("Invalid", result);
    }
}
