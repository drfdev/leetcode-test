package dev.drf.leetcode.deepest.leaves.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeepestLeavesSumProblemTest {
    private final DeepestLeavesSumProblem problem = new DeepestLeavesSumProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
        Output: 15
         */
        var root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(7),
                                null),
                        new TreeNode(5)),
                new TreeNode(3,
                        null,
                        new TreeNode(6,
                                null,
                                new TreeNode(8))));

        var sum = problem.deepestLeavesSum(root);

        assertEquals(15, sum);
    }

    @Test
    void example2() {
        /*
        Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        Output: 19
         */
        var root = new TreeNode(6,
                new TreeNode(7,
                        new TreeNode(2,
                                new TreeNode(9),
                                null),
                        new TreeNode(7,
                                new TreeNode(1),
                                new TreeNode(4))),
                new TreeNode(8,
                        new TreeNode(1),
                        new TreeNode(3,
                                null,
                                new TreeNode(5))));

        var sum = problem.deepestLeavesSum(root);

        assertEquals(19, sum);
    }
}
