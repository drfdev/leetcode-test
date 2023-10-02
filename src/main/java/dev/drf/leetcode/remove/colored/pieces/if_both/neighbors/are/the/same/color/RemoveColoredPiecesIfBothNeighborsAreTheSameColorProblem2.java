package dev.drf.leetcode.remove.colored.pieces.if_both.neighbors.are.the.same.color;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color
 * Used solution:
 * https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/solutions/1524153/c-python-java-count-aaa-and-bbb/
 */
public class RemoveColoredPiecesIfBothNeighborsAreTheSameColorProblem2 implements Problem {
    private static final char ALICE = 'A';
    private static final char BOB = 'B';

    public boolean winnerOfGame(String colors) {
        int aliceCount = 0, bobCount = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)
                    && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == ALICE) {
                    aliceCount++;
                } else {
                    bobCount++;
                }
            }
        }

        return aliceCount > bobCount;
    }
}
