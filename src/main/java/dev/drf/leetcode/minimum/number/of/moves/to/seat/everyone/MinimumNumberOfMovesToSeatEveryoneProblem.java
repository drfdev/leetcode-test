package dev.drf.leetcode.minimum.number.of.moves.to.seat.everyone;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/
 */
public class MinimumNumberOfMovesToSeatEveryoneProblem implements Problem {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        final int n = seats.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            var seat = seats[i];
            var student = students[i];
            result += Math.abs(seat - student);
        }

        return result;
    }
}
