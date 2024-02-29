package dev.drf.leetcode.even.odd.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddTreeProblemTest {
    private final EvenOddTreeProblem problem = new EvenOddTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
        Output: true
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(10,
                        new TreeNode(3,
                                new TreeNode(12),
                                new TreeNode(8)),
                        null),
                new TreeNode(4,
                        new TreeNode(7,
                                new TreeNode(6),
                                null),
                        new TreeNode(9,
                                null,
                                new TreeNode(2))));

        var bool = problem.isEvenOddTree(root);

        assertTrue(bool);
    }

    @Test
    void example2() {
        /*
        Input: root = [5,4,2,3,3,7]
        Output: false
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(3),
                        new TreeNode(3)),
                new TreeNode(2,
                        new TreeNode(7),
                        null));

        var bool = problem.isEvenOddTree(root);

        assertFalse(bool);
    }

    @Test
    void example3() {
        /*
        Input: root = [5,9,1,3,5,7]
        Output: false
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(9,
                        new TreeNode(3),
                        new TreeNode(5)),
                new TreeNode(1,
                        new TreeNode(7),
                        null));

        var bool = problem.isEvenOddTree(root);

        assertFalse(bool);
    }
}
