package dev.drf.leetcode.snakes.and.ladders;

import dev.drf.leetcode.Problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/snakes-and-ladders/
 * Used solutions:
 * https://www.youtube.com/watch?v=6lH4nO3JfLk
 * https://www.youtube.com/watch?v=A7Vdy9-xTjk
 * https://leetcode.com/problems/snakes-and-ladders/solutions/3092376/day-24-easiest-beginner-friendly-solution-o-n-2-time-and-o-n-2-space/
 */
public class SnakesAndLaddersProblem implements Problem {
    public int snakesAndLadders(int[][] board) {
        final int size = board.length;
        final int leastPosition = size * size;

        Queue<Integer> stack = new LinkedList<>();
        stack.add(1);

        boolean[][] visited = new boolean[size][size];
        visited[size - 1][0] = true;

        int moves = 0;
        while (!stack.isEmpty()) {
            int len = stack.size();

            for (int i = 0; i < len; i++) {
                int currBoardVal = stack.poll();
                if (currBoardVal == leastPosition) {
                    return moves;
                }

                for (int diceVal = 1; diceVal <= 6; diceVal++) {
                    if (currBoardVal + diceVal > leastPosition) {
                        break;
                    }

                    int[] pos = getCoords(currBoardVal + diceVal, size);
                    final int row = pos[0];
                    final int col = pos[1];

                    if (!visited[row][col]) {
                        visited[row][col] = true;
                        if (board[row][col] == -1) {
                            stack.add(currBoardVal + diceVal);
                        } else {
                            stack.add(board[row][col]);
                        }
                    }
                }
            }
            moves++;
        }
        return -1;
    }

    private int[] getCoords(int curr, int size) {
        int row = size - (curr - 1) / size - 1;
        int col = (curr - 1) % size;
        if (row % 2 == size % 2) {
            return new int[]{
                    row, size - col - 1
            };
        } else {
            return new int[]{
                    row, col
            };
        }
    }
}
