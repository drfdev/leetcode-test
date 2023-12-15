package dev.drf.leetcode.construct.binary.tree.from.inorder.and.postorder.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalProblemTest {
    private final ConstructBinaryTreeFromInorderAndPostorderTraversalProblem problem = new ConstructBinaryTreeFromInorderAndPostorderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
        Output: [3,9,20,null,null,15,7]
         */
        int[] inorder = new int[]{
                9, 3, 15, 20, 7
        };
        int[] postorder = new int[]{
                9, 15, 7, 20, 3
        };

        var tree = problem.buildTree(inorder, postorder);

        assertEquals(3, tree.val);
        assertEquals(9, tree.left.val);
        assertEquals(20, tree.right.val);
        assertEquals(15, tree.right.left.val);
        assertEquals(7, tree.right.right.val);
    }

    @Test
    void example2() {
        /*
        Input: inorder = [-1], postorder = [-1]
        Output: [-1]
         */
        int[] inorder = new int[]{
                -1
        };
        int[] postorder = new int[]{
                -1
        };

        var tree = problem.buildTree(inorder, postorder);

        assertEquals(-1, tree.val);
        assertNull(tree.left);
        assertNull(tree.right);
    }
}
