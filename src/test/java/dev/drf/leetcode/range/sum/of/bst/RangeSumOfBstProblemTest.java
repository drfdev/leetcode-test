package dev.drf.leetcode.range.sum.of.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumOfBstProblemTest {
    private final RangeSumOfBstProblem problem = new RangeSumOfBstProblem();

    @Test
    void example1() {
        /*
        Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
        Output: 32
         */
        var root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3),
                        new TreeNode(7)),
                new TreeNode(15,
                        null,
                        new TreeNode(18)));

        var sum = problem.rangeSumBST(root, 7, 15);

        assertEquals(32, sum);
    }

    @Test
    void example2() {
        /*
        Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
        Output: 23
         */
        var root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(1),
                                null),
                        new TreeNode(7,
                                new TreeNode(6),
                                null)),
                new TreeNode(15,
                        new TreeNode(13),
                        new TreeNode(18)));

        var sum = problem.rangeSumBST(root, 6, 10);

        assertEquals(23, sum);
    }
}
