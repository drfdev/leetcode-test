package dev.drf.leetcode.sum.root.to.leaf.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumRootToLeafNumbersProblemTest {
    private final SumRootToLeafNumbersProblem problem = new SumRootToLeafNumbersProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3]
        Output: 25
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        var sum = problem.sumNumbers(root);

        assertEquals(25, sum);
    }

    @Test
    void example2() {
        /*
        Input: root = [4,9,0,5,1]
        Output: 1026
         */
        TreeNode root = new TreeNode(4,
                new TreeNode(9,
                        new TreeNode(5),
                        new TreeNode(1)),
                new TreeNode(0));

        var sum = problem.sumNumbers(root);

        assertEquals(1026, sum);
    }
}
