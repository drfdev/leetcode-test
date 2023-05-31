package dev.drf.leetcode.car.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFleetProblemTest {
    private final CarFleetProblem problem = new CarFleetProblem();

    @Test
    void example1() {
        /*
        Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
        Output: 3
         */
        int target = 12;
        int[] position = new int[]{10, 8, 0, 5, 3};
        int[] speed = new int[]{2, 4, 1, 1, 3};

        var count = problem.carFleet(target, position, speed);

        assertEquals(3, count);
    }

    @Test
    void example2() {
        /*
        Input: target = 10, position = [3], speed = [3]
        Output: 1
         */
        int target = 10;
        int[] position = new int[]{3};
        int[] speed = new int[]{3};

        var count = problem.carFleet(target, position, speed);

        assertEquals(1, count);
    }

    @Test
    void example3() {
        /*
        Input: target = 100, position = [0,2,4], speed = [4,2,1]
        Output: 1
         */
        int target = 100;
        int[] position = new int[]{0, 2, 4};
        int[] speed = new int[]{4, 2, 1};

        var count = problem.carFleet(target, position, speed);

        assertEquals(1, count);
    }
}
