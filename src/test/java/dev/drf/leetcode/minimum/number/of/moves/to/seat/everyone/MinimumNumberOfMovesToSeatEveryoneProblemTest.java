package dev.drf.leetcode.minimum.number.of.moves.to.seat.everyone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfMovesToSeatEveryoneProblemTest {
    private final MinimumNumberOfMovesToSeatEveryoneProblem problem = new MinimumNumberOfMovesToSeatEveryoneProblem();

    @Test
    void example1() {
        /*
        Input: seats = [3,1,5], students = [2,7,4]
        Output: 4
         */
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};

        var out = problem.minMovesToSeat(seats, students);

        assertEquals(4, out);
    }

    @Test
    void example2() {
        /*
        Input: seats = [4,1,5,9], students = [1,3,2,6]
        Output: 7
         */
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};

        var out = problem.minMovesToSeat(seats, students);

        assertEquals(7, out);
    }

    @Test
    void example3() {
        /*
        Input: seats = [2,2,6,6], students = [1,3,2,6]
        Output: 4
         */
        int[] seats = {2, 2, 6, 6};
        int[] students = {1, 3, 2, 6};

        var out = problem.minMovesToSeat(seats, students);

        assertEquals(4, out);
    }
}
