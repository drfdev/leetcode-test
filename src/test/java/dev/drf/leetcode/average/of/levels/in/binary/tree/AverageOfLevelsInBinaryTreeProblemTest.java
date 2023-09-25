package dev.drf.leetcode.average.of.levels.in.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageOfLevelsInBinaryTreeProblemTest {
    private static final double DELTA = 0.00001d;
    private final AverageOfLevelsInBinaryTreeProblem problem = new AverageOfLevelsInBinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,9,20,null,null,15,7]
        Output: [3.00000,14.50000,11.00000]
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        var lists = problem.averageOfLevels(root);

        assertEquals(3, lists.size());
        assertEquals(3.00000, lists.get(0), DELTA);
        assertEquals(14.50000, lists.get(1), DELTA);
        assertEquals(11.00000, lists.get(2), DELTA);
    }

    @Test
    void example2() {
        /*
        Input: root = [3,9,20,15,7]
        Output: [3.00000,14.50000,11.00000]
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(9,
                        new TreeNode(15),
                        new TreeNode(7)),
                new TreeNode(20));

        var lists = problem.averageOfLevels(root);

        assertEquals(3, lists.size());
        assertEquals(3.00000, lists.get(0), DELTA);
        assertEquals(14.50000, lists.get(1), DELTA);
        assertEquals(11.00000, lists.get(2), DELTA);
    }
}
