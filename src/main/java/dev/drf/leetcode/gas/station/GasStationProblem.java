package dev.drf.leetcode.gas.station;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/gas-station/
 * Used solution:
 * https://www.youtube.com/watch?v=lJwbPZGo05A
 */
public class GasStationProblem implements Problem {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGas = 0;
        int sCost = 0;

        for (int i = 0; i < gas.length; i++) {
            sGas += gas[i];
            sCost += cost[i];
        }

        if (sGas < sCost) {
            return -1;
        }

        int res = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                res = i + 1;
            }
        }
        return res;
    }
}
