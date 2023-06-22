package dev.drf.leetcode.construct.binary.tree.from.preorder.and.inorder.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalProblemTest {
    private final ConstructBinaryTreeFromPreorderAndInorderTraversalProblem problem = new ConstructBinaryTreeFromPreorderAndInorderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
        Output: [3,9,20,null,null,15,7]
         */
        int[] preorder = new int[]{
                3, 9, 20, 15, 7
        };
        int[] inorder = new int[]{
                9, 3, 15, 20, 7
        };

        var root = problem.buildTree(preorder, inorder);

        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);

        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }
}
