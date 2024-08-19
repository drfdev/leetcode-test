package dev.drf.leetcode._2.keys.keyboard;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/2-keys-keyboard/
 * Used solution:
 * https://leetcode.com/problems/2-keys-keyboard/solutions/5657975/98-33-easy-solution-with-ultimate-explanation/
 */
public class P2KeysKeyboardProblem implements Problem {
    public int minSteps(int n) {
        if (n < 2) {
            return 0;
        }

        int steps = 0;
        int factor = 2;

        while (n > 1) {
            while (n % factor == 0) {
                steps += factor;
                n /= factor;
            }
            factor++;
        }

        return steps;
    }
}
