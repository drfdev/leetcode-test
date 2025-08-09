package dev.drf.leetcode.count.nodes.equal.to.average.of.subtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNodesEqualToAverageOfSubtreeProblemTest {
    private final CountNodesEqualToAverageOfSubtreeProblem problem = new CountNodesEqualToAverageOfSubtreeProblem();

    @Test
    void example1() {
        // Input: root = [4,8,5,0,1,null,6]
        // Output: 5
        TreeNode root = new TreeNode(4,
                new TreeNode(8,
                        new TreeNode(0),
                        new TreeNode(1)),
                new TreeNode(5,
                        null,
                        new TreeNode(6)));

        int count = problem.averageOfSubtree(root);

        assertEquals(5, count);
    }

    @Test
    void example2() {
        // Input: root = [1]
        // Output: 1
        TreeNode root = new TreeNode(1);

        int count = problem.averageOfSubtree(root);

        assertEquals(1, count);
    }
}
