package dev.drf.leetcode.find.the.highest.altitude;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheHighestAltitudeProblemTest {
    private final FindTheHighestAltitudeProblem problem = new FindTheHighestAltitudeProblem();

    @Test
    void example1() {
        /*
        Input: gain = [-5,1,5,0,-7]
        Output: 1
        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
         */
        int[] gain = new int[]{-5, 1, 5, 0, -7};

        int value = problem.largestAltitude(gain);

        assertEquals(1, value);
    }

    @Test
    void example2() {
        /*
        Input: gain = [-4,-3,-2,-1,4,3,2]
        Output: 0
        Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
         */
        int[] gain = new int[]{-4, -3, -2, -1, 4, 3, 2};

        int value = problem.largestAltitude(gain);

        assertEquals(0, value);
    }
}
