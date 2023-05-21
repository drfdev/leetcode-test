package dev.drf.leetcode.unique.number.of.occurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueNumberOfOccurrencesProblemTest {
    private final UniqueNumberOfOccurrencesProblem problem = new UniqueNumberOfOccurrencesProblem();

    @Test
    void example1() {
        /*
        Input: arr = [1,2,2,1,1,3]
        Output: true
         */
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};

        var isUnique = problem.uniqueOccurrences(arr);

        assertTrue(isUnique);
    }

    @Test
    void example2() {
        /*
        Input: arr = [1,2]
        Output: false
         */
        int[] arr = new int[]{1, 2};

        var isUnique = problem.uniqueOccurrences(arr);

        assertFalse(isUnique);
    }

    @Test
    void example3() {
        /*
        Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
        Output: true
         */
        int[] arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        var isUnique = problem.uniqueOccurrences(arr);

        assertTrue(isUnique);
    }
}
