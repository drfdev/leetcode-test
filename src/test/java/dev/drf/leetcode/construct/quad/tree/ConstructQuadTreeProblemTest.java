package dev.drf.leetcode.construct.quad.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConstructQuadTreeProblemTest {
    private final ConstructQuadTreeProblem problem = new ConstructQuadTreeProblem();

    @Test
    void example1() {
        /*
        Input: grid = [[0,1],[1,0]]
        Output: [[0,1],[1,0],[1,1],[1,1],[1,0]]
         */
        int[][] grid = new int[][]{
                {0, 1},
                {1, 0}
        };

        var node = problem.construct(grid);

        assertNotNull(node);
        assertFalse(node.isLeaf);
//        assertTrue(node.val);

        assertNotNull(node.topLeft);
        assertTrue(node.topLeft.isLeaf);
        assertFalse(node.topLeft.val);

        assertNotNull(node.topRight);
        assertTrue(node.topRight.isLeaf);
        assertTrue(node.topRight.val);

        assertNotNull(node.bottomLeft);
        assertTrue(node.bottomLeft.isLeaf);
        assertTrue(node.bottomLeft.val);

        assertNotNull(node.bottomRight);
        assertTrue(node.bottomRight.isLeaf);
        assertFalse(node.bottomRight.val);
    }

    @Test
    void example2() {
        /*
        Input: grid = [[1,1,1,1,0,0,0,0],
                       [1,1,1,1,0,0,0,0],
                       [1,1,1,1,1,1,1,1],
                       [1,1,1,1,1,1,1,1],
                       [1,1,1,1,0,0,0,0],
                       [1,1,1,1,0,0,0,0],
                       [1,1,1,1,0,0,0,0],
                       [1,1,1,1,0,0,0,0]]
        Output: [[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]]
         */
        int[][] grid = new int[][]{
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };

        var node = problem.construct(grid);

        assertNotNull(node);
        assertFalse(node.isLeaf);
//        assertTrue(node.val);

        // 1 row
        assertNotNull(node.topLeft);
        assertTrue(node.topLeft.isLeaf);
        assertTrue(node.topLeft.val);

        assertNotNull(node.topRight);
        assertFalse(node.topRight.isLeaf);
//        assertTrue(node.topRight.val);

        assertNotNull(node.bottomLeft);
        assertTrue(node.bottomLeft.isLeaf);
        assertTrue(node.bottomLeft.val);

        assertNotNull(node.bottomRight);
        assertTrue(node.bottomRight.isLeaf);
        assertFalse(node.bottomRight.val);

        // 2 row
        assertNotNull(node.topRight.topLeft);
        assertTrue(node.topRight.topLeft.isLeaf);
        assertFalse(node.topRight.topLeft.val);

        assertNotNull(node.topRight.topRight);
        assertTrue(node.topRight.topRight.isLeaf);
        assertFalse(node.topRight.topRight.val);

        assertNotNull(node.topRight.bottomLeft);
        assertTrue(node.topRight.bottomLeft.isLeaf);
        assertTrue(node.topRight.bottomLeft.val);

        assertNotNull(node.topRight.bottomRight);
        assertTrue(node.topRight.bottomRight.isLeaf);
        assertTrue(node.topRight.bottomRight.val);
    }
}
