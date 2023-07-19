package dev.drf.leetcode.remove.element;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementProblemTest {
    private final RemoveElementProblem problem = new RemoveElementProblem();

    @Test
    void example1() {
        /*
        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
         */
        int[] nums = new int[]{
                3, 2, 2, 3
        };
        int val = 3;

        var res = problem.removeElement(nums, val);

        assertEquals(2, res);

        int[] resNums = new int[res];
        System.arraycopy(nums, 0, resNums, 0, res);
        var list = Arrays.stream(resNums)
                .boxed()
                .toList();
        assertThat(list, containsInAnyOrder(
                2, 2
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]
         */
        int[] nums = new int[]{
                0, 1, 2, 2, 3, 0, 4, 2
        };
        int val = 2;

        var res = problem.removeElement(nums, val);

        assertEquals(5, res);

        int[] resNums = new int[res];
        System.arraycopy(nums, 0, resNums, 0, res);
        var list = Arrays.stream(resNums)
                .boxed()
                .toList();
        assertThat(list, containsInAnyOrder(
                0, 1, 4, 0, 3
        ));
    }
}
