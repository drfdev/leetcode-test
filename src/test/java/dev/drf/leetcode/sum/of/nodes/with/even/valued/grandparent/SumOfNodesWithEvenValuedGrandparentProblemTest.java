package dev.drf.leetcode.sum.of.nodes.with.even.valued.grandparent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNodesWithEvenValuedGrandparentProblemTest {
    private final SumOfNodesWithEvenValuedGrandparentProblem problem = new SumOfNodesWithEvenValuedGrandparentProblem();

    @Test
    void example1() {
        // Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        // Output: 18
        TreeNode root = new TreeNode(6,
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

        int out = problem.sumEvenGrandparent(root);

        assertEquals(18, out);
    }

    @Test
    void example2() {
        // Input: root = [1]
        // Output: 0
        TreeNode root = new TreeNode();

        int out = problem.sumEvenGrandparent(root);

        assertEquals(0, out);
    }
}
