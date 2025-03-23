package dev.drf.leetcode.minimum.number.of.operations.to.move.all.balls.to.each.box;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 * Used solution:
 * https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/solutions/1075474/c-java-o-n-ltr-rtl/
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBoxProblem implements Problem {
    public int[] minOperations(String boxes) {
        final int size = boxes.length();
        final int[] answer = new int[size];

        int ops = 0;
        int cnt = 0;

        for (int i = 0; i < size; i++) {
            answer[i] += ops;
            cnt += boxes.charAt(i) == '1' ? 1 : 0;
            ops += cnt;
        }

        ops = 0;
        cnt = 0;

        for (int i = size - 1; i >= 0; i--) {
            answer[i] += ops;
            cnt += boxes.charAt(i) == '1' ? 1 : 0;
            ops += cnt;
        }

        return answer;
    }
}
