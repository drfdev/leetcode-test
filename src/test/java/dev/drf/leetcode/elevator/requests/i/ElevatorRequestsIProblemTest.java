package dev.drf.leetcode.elevator.requests.i;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElevatorRequestsIProblemTest {
    private final ElevatorRequestsIProblem problem = new ElevatorRequestsIProblem();

    @Test
    void example1() {
        // Input: n = 5, requests = [2,1,4,3]
        // Output: 7
        int n = 5;
        int[] requests = {2, 1, 4, 3};

        int sum = problem.elevatorRequests(n, requests);

        assertEquals(7, sum);
    }

    @Test
    void example2() {
        // Input: n = 3, requests = [2,0,0]
        // Output: 4
        int n = 3;
        int[] requests = {2, 0, 0};

        int sum = problem.elevatorRequests(n, requests);

        assertEquals(4, sum);
    }
}
