package dev.drf.leetcode.elevator.requests.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/elevator-requests-i/
 */
public class ElevatorRequestsIProblem implements Problem {
    public int elevatorRequests(int n, int[] requests) {
        int floorFrom = 0;
        int floorTo = 0;

        int totalTime = 0;

        for (int i = 0; i < requests.length; i++) {
            floorTo = requests[i];
            int diff = Math.abs(floorTo - floorFrom);
            totalTime += diff;
            floorFrom = floorTo;
        }

        return totalTime;
    }
}
