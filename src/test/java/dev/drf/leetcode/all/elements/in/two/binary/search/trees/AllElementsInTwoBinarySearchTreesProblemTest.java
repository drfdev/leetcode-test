package dev.drf.leetcode.all.elements.in.two.binary.search.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllElementsInTwoBinarySearchTreesProblemTest {
    private final AllElementsInTwoBinarySearchTreesProblem problem = new AllElementsInTwoBinarySearchTreesProblem();

    @Test
    void example1() {
        // Input: root1 = [2,1,4], root2 = [1,0,3]
        // Output: [0,1,1,2,3,4]
        TreeNode root1 = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(4));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(3));

        var list = problem.getAllElements(root1, root2);

        assertEquals(List.of(0, 1, 1, 2, 3, 4), list);
    }

    @Test
    void example2() {
        // Input: root1 = [1,null,8], root2 = [8,1]
        // Output: [1,1,8,8]
        TreeNode root1 = new TreeNode(1,
                null,
                new TreeNode(8));
        TreeNode root2 = new TreeNode(8,
                new TreeNode(1),
                null);

        var list = problem.getAllElements(root1, root2);

        assertEquals(List.of(1, 1, 8, 8), list);
    }
}
