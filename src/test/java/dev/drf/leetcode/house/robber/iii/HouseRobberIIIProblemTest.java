package dev.drf.leetcode.house.robber.iii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberIIIProblemTest {
    private final HouseRobberIIIProblem problem = new HouseRobberIIIProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,2,3,null,3,null,1]
        Output: 7
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        null,
                        new TreeNode(3)),
                new TreeNode(3,
                        null,
                        new TreeNode(1)));

        var result = problem.rob(root);

        assertEquals(7, result);
    }

    @Test
    void example2() {
        /*
        Input: root = [3,4,5,1,3,null,1]
        Output: 9
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(5,
                        null,
                        new TreeNode(1)));

        var result = problem.rob(root);

        assertEquals(9, result);
    }
}
