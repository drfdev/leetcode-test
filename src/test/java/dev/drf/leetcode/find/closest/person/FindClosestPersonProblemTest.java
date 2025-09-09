package dev.drf.leetcode.find.closest.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindClosestPersonProblemTest {
    private final FindClosestPersonProblem problem = new FindClosestPersonProblem();

    @Test
    void example1() {
        // Input: x = 2, y = 7, z = 4
        // Output: 1
        int x = 2;
        int y = 7;
        int z = 4;

        int num = problem.findClosest(x, y, z);

        assertEquals(1, num);
    }

    @Test
    void example2() {
        // Input: x = 2, y = 5, z = 6
        // Output: 2
        int x = 2;
        int y = 5;
        int z = 6;

        int num = problem.findClosest(x, y, z);

        assertEquals(2, num);
    }

    @Test
    void example3() {
        // Input: x = 1, y = 5, z = 3
        // Output: 0
        int x = 1;
        int y = 5;
        int z = 3;

        int num = problem.findClosest(x, y, z);

        assertEquals(0, num);
    }
}
