package dev.drf.leetcode.gas.station;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasStationProblemTest {
    private final GasStationProblem problem = new GasStationProblem();

    @Test
    void example1() {
        /*
        Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        Output: 3
         */
        int[] gas = new int[]{
                1, 2, 3, 4, 5
        };
        int[] cost = new int[]{
                3, 4, 5, 1, 2
        };

        var index = problem.canCompleteCircuit(gas, cost);

        assertEquals(3, index);
    }

    @Test
    void example2() {
        /*
        Input: gas = [2,3,4], cost = [3,4,3]
        Output: -1
         */
        int[] gas = new int[]{
                2, 3, 4
        };
        int[] cost = new int[]{
                3, 4, 3
        };

        var index = problem.canCompleteCircuit(gas, cost);

        assertEquals(-1, index);
    }
}
