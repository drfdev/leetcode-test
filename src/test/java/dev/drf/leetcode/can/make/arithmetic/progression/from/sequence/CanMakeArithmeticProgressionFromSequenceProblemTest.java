package dev.drf.leetcode.can.make.arithmetic.progression.from.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanMakeArithmeticProgressionFromSequenceProblemTest {
    private final CanMakeArithmeticProgressionFromSequenceProblem problem = new CanMakeArithmeticProgressionFromSequenceProblem();

    @Test
    void example1() {
        /*
        Input: arr = [3,5,1]
        Output: true
         */
        int[] arr = new int[]{
                3, 5, 1
        };

        var isProgression = problem.canMakeArithmeticProgression(arr);

        assertTrue(isProgression);
    }

    @Test
    void example2() {
        /*
        Input: arr = [1,2,4]
        Output: false
         */
        int[] arr = new int[]{
                1, 2, 4
        };

        var isProgression = problem.canMakeArithmeticProgression(arr);

        assertFalse(isProgression);
    }
}
