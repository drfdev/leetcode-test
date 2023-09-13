package dev.drf.leetcode.detect.squares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetectSquaresProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["DetectSquares", "add", "add", "add", "count", "count", "add", "count"]
        [[], [[3, 10]], [[11, 2]], [[3, 2]], [[11, 10]], [[14, 8]], [[11, 2]], [[11, 10]]]
        Output
        [null, null, null, null, 1, 0, null, 2]
         */
        var detectSquares = new DetectSquaresProblem.DetectSquares();
        detectSquares.add(new int[]{3, 10});
        detectSquares.add(new int[]{11, 2});
        detectSquares.add(new int[]{3, 2});
        var cnt1 = detectSquares.count(new int[]{11, 10});
        var cnt2 = detectSquares.count(new int[]{14, 8});
        detectSquares.add(new int[]{11, 2});
        var cnt3 = detectSquares.count(new int[]{11, 10});

        assertEquals(1, cnt1);
        assertEquals(0, cnt2);
        assertEquals(2, cnt3);
    }
}
