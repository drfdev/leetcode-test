package dev.drf.leetcode.minimum.time.difference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTimeDifferenceProblemTest {
    private final MinimumTimeDifferenceProblem problem = new MinimumTimeDifferenceProblem();

    @Test
    void example1() {
        /*
        Input: timePoints = ["23:59","00:00"]
        Output: 1
         */
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");

        var out = problem.findMinDifference(timePoints);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: timePoints = ["00:00","23:59","00:00"]
        Output: 0
         */
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("23:59");
        timePoints.add("00:00");

        var out = problem.findMinDifference(timePoints);

        assertEquals(0, out);
    }

    @Test
    void failed1() {
        // ["01:01","02:01"]
        // 60
        List<String> timePoints = new ArrayList<>();
        timePoints.add("01:01");
        timePoints.add("02:01");

        var out = problem.findMinDifference(timePoints);

        assertEquals(60, out);
    }

    @Test
    void failed2() {
        // ["12:12","00:13"]
        // 719
        List<String> timePoints = new ArrayList<>();
        timePoints.add("12:12");
        timePoints.add("00:13");

        var out = problem.findMinDifference(timePoints);

        assertEquals(719, out);
    }

    @Test
    void failed3() {
        // ["05:31","22:08","00:35"]
        // 147
        List<String> timePoints = new ArrayList<>();
        timePoints.add("05:31");
        timePoints.add("22:08");
        timePoints.add("00:35");

        var out = problem.findMinDifference(timePoints);

        assertEquals(147, out);
    }
}
