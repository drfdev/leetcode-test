package dev.drf.leetcode.find.all.duplicates.in.an.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindAllDuplicatesInAnArrayProblemTest {
    private final FindAllDuplicatesInAnArrayProblem problem = new FindAllDuplicatesInAnArrayProblem();

    @Test
    void example1() {
        /*
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]
         */
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        var result = problem.findDuplicates(nums);

        assertThat(result, containsInAnyOrder(
                2, 3
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,1,2]
        Output: [1]
         */
        int[] nums = {1, 1, 2};

        var result = problem.findDuplicates(nums);

        assertThat(result, containsInAnyOrder(
                1
        ));
    }

    @Test
    void example3() {
        /*
        Input: nums = [1]
        Output: []
         */
        int[] nums = {1};

        var result = problem.findDuplicates(nums);

        assertTrue(result.isEmpty());
    }
}
