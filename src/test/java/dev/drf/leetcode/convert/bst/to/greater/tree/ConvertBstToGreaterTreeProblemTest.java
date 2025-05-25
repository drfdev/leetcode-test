package dev.drf.leetcode.convert.bst.to.greater.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ConvertBstToGreaterTreeProblemTest {
    private final ConvertBstToGreaterTreeProblem problem = new ConvertBstToGreaterTreeProblem();

    private static void assertTree(TreeNode expected,
                                   TreeNode result) {
        if (expected == null && result == null) {
            return;
        }
        if (expected == null || result == null) {
            fail();
        }
        assertEquals(expected.val, result.val);

        assertTree(expected.left, result.left);
        assertTree(expected.right, result.right);
    }

    @Test
    void example1() {
        // Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
        // Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
        TreeNode root = new TreeNode(4,
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(2,
                                null,
                                new TreeNode(3))),
                new TreeNode(6,
                        new TreeNode(5),
                        new TreeNode(7,
                                null,
                                new TreeNode(8))));

        var result = problem.convertBST(root);

        TreeNode expected = new TreeNode(30,
                new TreeNode(36,
                        new TreeNode(36),
                        new TreeNode(35,
                                null,
                                new TreeNode(33))),
                new TreeNode(21,
                        new TreeNode(26),
                        new TreeNode(15,
                                null,
                                new TreeNode(8))));
        assertTree(expected, result);
    }
    
    @Test
    void example2() {
        // Input: root = [0,null,1]
        // Output: [1,null,1]
        TreeNode root = new TreeNode(0,
                null,
                new TreeNode(1));

        var result = problem.convertBST(root);

        TreeNode expected = new TreeNode(1,
                null,
                new TreeNode(1));
        assertTree(expected, result);
    }
}
