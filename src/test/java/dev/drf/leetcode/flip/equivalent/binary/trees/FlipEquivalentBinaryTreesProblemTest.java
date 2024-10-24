package dev.drf.leetcode.flip.equivalent.binary.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlipEquivalentBinaryTreesProblemTest {
    private final FlipEquivalentBinaryTreesProblem problem = new FlipEquivalentBinaryTreesProblem();

    @Test
    void example1() {
        /*
        Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
        Output: true
         */
        var root1 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(7),
                                new TreeNode(8))),
                new TreeNode(3,
                        new TreeNode(6),
                        null));
        var root2 = new TreeNode(1,
                new TreeNode(3,
                        null,
                        new TreeNode(6)),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(8),
                                new TreeNode(7))));

        var equiv = problem.flipEquiv(root1, root2);

        assertTrue(equiv);
    }

    @Test
    void example2() {
        /*
        Input: root1 = [], root2 = []
        Output: true
         */
        TreeNode root1 = null;
        TreeNode root2 = null;

        var equiv = problem.flipEquiv(root1, root2);

        assertTrue(equiv);
    }

    @Test
    void example3() {
        /*
        Input: root1 = [], root2 = [1]
        Output: false
         */
        TreeNode root1 = null;
        var root2 = new TreeNode(1);

        var equiv = problem.flipEquiv(root1, root2);

        assertFalse(equiv);
    }
}
