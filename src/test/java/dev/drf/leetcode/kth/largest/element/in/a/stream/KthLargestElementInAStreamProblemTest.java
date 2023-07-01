package dev.drf.leetcode.kth.largest.element.in.a.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementInAStreamProblemTest {
    @Test
    void example() {
        /*
        Input
        ["KthLargest", "add", "add", "add", "add", "add"]
        [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
        Output
        [null, 4, 5, 5, 8, 8]

        Explanation
        KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
        kthLargest.add(3);   // return 4
        kthLargest.add(5);   // return 5
        kthLargest.add(10);  // return 5
        kthLargest.add(9);   // return 8
        kthLargest.add(4);   // return 8
         */

        var kthLargest = new KthLargestElementInAStreamProblem.KthLargest(3, new int[]{4, 5, 8, 2});
        var val1 = kthLargest.add(3);   // return 4
        var val2 = kthLargest.add(5);   // return 5
        var val3 = kthLargest.add(10);  // return 5
        var val4 = kthLargest.add(9);   // return 8
        var val5 = kthLargest.add(4);   // return 8

        assertEquals(4, val1);
        assertEquals(5, val2);
        assertEquals(5, val3);
        assertEquals(8, val4);
        assertEquals(8, val5);
    }
}
