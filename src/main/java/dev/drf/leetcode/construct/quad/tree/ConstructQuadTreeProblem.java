package dev.drf.leetcode.construct.quad.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/construct-quad-tree/
 */
public class ConstructQuadTreeProblem implements Problem {
    public Node construct(int[][] grid) {
        final int size = grid.length;
        return buildNode(grid, 0, size - 1, 0, size - 1);
    }

    private Node buildNode(int[][] grid, int x1, int x2, int y1, int y2) {
        if (x1 == x2) {
            int val = grid[x1][y1];
            return new Node(val == 1, true);
        }

        int rowMid = (x1 + x2) / 2;
        int colMid = (y1 + y2) / 2;

        Node topLeft = buildNode(grid, x1, rowMid, y1, colMid);
        Node topRight = buildNode(grid, x1, rowMid, colMid + 1, y2);
        Node bottomLeft = buildNode(grid, rowMid + 1, x2, y1, colMid);
        Node bottomRight = buildNode(grid, rowMid + 1, x2, colMid + 1, y2);

        Node result = new Node();
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf
                && topLeft.val == topRight.val
                && topRight.val == bottomLeft.val
                && bottomLeft.val == bottomRight.val) {
            result.isLeaf = true;
            result.val = topLeft.val;
        } else {
            result.topLeft = topLeft;
            result.topRight = topRight;
            result.bottomLeft = bottomLeft;
            result.bottomRight = bottomRight;
        }
        return result;
    }
}
