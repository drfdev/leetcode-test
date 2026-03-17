package dev.drf.leetcode.evaluate.boolean_binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvaluateBooleanBinaryTreeProblemTest {
    private final EvaluateBooleanBinaryTreeProblem problem = new EvaluateBooleanBinaryTreeProblem();

    @Test
    void example1() {
        // Input: root = [2,1,3,null,null,0,1]
        // Output: true
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3,
                        new TreeNode(0),
                        new TreeNode(1)));

        boolean bool = problem.evaluateTree(root);

        assertTrue(bool);
    }

    @Test
    void example2() {
        // Input: root = [0]
        // Output: false
        TreeNode root = new TreeNode(0);

        boolean bool = problem.evaluateTree(root);

        assertFalse(bool);
    }
}
