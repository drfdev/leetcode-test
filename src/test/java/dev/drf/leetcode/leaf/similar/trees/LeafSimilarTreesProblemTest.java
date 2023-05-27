package dev.drf.leetcode.leaf.similar.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeafSimilarTreesProblemTest {
    private final LeafSimilarTreesProblem problem = new LeafSimilarTreesProblem();

    @Test
    void example1() {
        /*
        Input: root1 = [3,5,1,6,2,9,8,null,null,7,4],
        root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
        Output: true
         */
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(9),
                        new TreeNode(8)));
        TreeNode root2 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(7)),
                new TreeNode(1,
                        new TreeNode(4),
                        new TreeNode(2,
                                new TreeNode(9),
                                new TreeNode(8))));

        var res = problem.leafSimilar(root1, root2);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: root1 = [1,2,3], root2 = [1,3,2]
        Output: false
         */
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2));

        var res = problem.leafSimilar(root1, root2);

        assertFalse(res);
    }
}
