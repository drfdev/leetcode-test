package dev.drf.leetcode.path.sum.iii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathSumIIIProblemTest {
    private final PathSumIIIProblem problem = new PathSumIIIProblem();

    @Test
    void example1() {
        /*
        Input: root = [10,5,-3,3,2,null,11,3,-2,null,1],
            targetSum = 8
        Output: 3
         */
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(3),
                                new TreeNode(-2)),
                        new TreeNode(2,
                                null,
                                new TreeNode(1))),
                new TreeNode(-3,
                        null,
                        new TreeNode(11)));
        int targetSum = 8;

        var res = problem.pathSum(root, targetSum);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        /*
        Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1],
            targetSum = 22
        Output: 3
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(1))));
        int targetSum = 22;

        var res = problem.pathSum(root, targetSum);

        assertEquals(3, res);
    }

    @Test
    void failed1() {
        /*
        [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]
        targetSum = 0
        expected = 0
         */
        TreeNode root = new TreeNode(1000000000,
                new TreeNode(1000000000,
                        new TreeNode(294967296,
                                new TreeNode(1000000000,
                                        new TreeNode(1000000000,
                                                new TreeNode(1000000000),
                                                null),
                                        null),
                                null),
                        null),
                null);

        int targetSum = 0;

        var res = problem.pathSum(root, targetSum);

        assertEquals(0, res);
    }
}
