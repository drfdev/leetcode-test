package dev.drf.leetcode.create.binary.tree.from.descriptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateBinaryTreeFromDescriptionsProblemTest {
    private final CreateBinaryTreeFromDescriptionsProblem problem = new CreateBinaryTreeFromDescriptionsProblem();

    @Test
    void example1() {
        // Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
        // Output: [50,20,80,15,17,19]
        int[][] descriptions = {
                {20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}
        };

        var root = problem.createBinaryTree(descriptions);

        assertNotNull(root);
        assertEquals(50, root.val);
        assertEquals(20, root.left.val);
        assertEquals(80, root.right.val);
        assertEquals(15, root.left.left.val);
        assertEquals(17, root.left.right.val);
        assertEquals(19, root.right.left.val);
        assertNull(root.right.right);
    }

    @Test
    void example2() {
        // Input: descriptions = [[1,2,1],[2,3,0],[3,4,1]]
        // Output: [1,2,null,null,3,4]
        int[][] descriptions = {
                {1, 2, 1}, {2, 3, 0}, {3, 4, 1}
        };

        var root = problem.createBinaryTree(descriptions);

        assertNotNull(root);
        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertNull(root.right);
        assertEquals(3, root.left.right.val);
        assertNull(root.left.left);
        assertEquals(4, root.left.right.left.val);
        assertNull(root.left.right.right);
    }

    @Test
    void failure1() {
        // [[39,70,1],[13,39,1],[85,74,1],[74,13,1],[38,82,1],[82,85,1]]
        // [38,82,null,85,null,74,null,13,null,39,null,70]
        int[][] descriptions = {
                {39, 70, 1}, {13, 39, 1}, {85, 74, 1}, {74, 13, 1}, {38, 82, 1}, {82, 85, 1}
        };

        var root = problem.createBinaryTree(descriptions);

        System.out.println(root);
    }
}
