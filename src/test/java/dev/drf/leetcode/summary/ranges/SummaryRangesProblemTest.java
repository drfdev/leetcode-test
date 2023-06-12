package dev.drf.leetcode.summary.ranges;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class SummaryRangesProblemTest {
    private final SummaryRangesProblem problem = new SummaryRangesProblem();

    @Test
    void example1() {
        /*
        Input: nums = [0,1,2,4,5,7]
        Output: ["0->2","4->5","7"]
         */
        int[] nums = new int[]{
                0, 1, 2, 4, 5, 7
        };

        var list = problem.summaryRanges(nums);

        assertThat(list, contains(
                "0->2", "4->5", "7"
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,2,3,4,6,8,9]
        Output: ["0","2->4","6","8->9"]
         */
        int[] nums = new int[]{
                0, 2, 3, 4, 6, 8, 9
        };

        var list = problem.summaryRanges(nums);

        assertThat(list, contains(
                "0", "2->4", "6", "8->9"
        ));
    }
}
