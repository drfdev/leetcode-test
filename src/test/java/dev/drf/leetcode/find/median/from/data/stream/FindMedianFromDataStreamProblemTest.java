package dev.drf.leetcode.find.median.from.data.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMedianFromDataStreamProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
        [[], [1], [2], [], [3], []]
        Output
        [null, null, null, 1.5, null, 2.0]

        Explanation
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        medianFinder.findMedian(); // return 2.0
         */
        var medianFinder = new FindMedianFromDataStreamProblem.MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        var res1 = medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        var res2 = medianFinder.findMedian(); // return 2.0

        assertEquals(1.5d, res1);
        assertEquals(2.0d, res2);
    }
}
