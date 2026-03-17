package dev.drf.leetcode.construct.binary.search.tree.from.preorder.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructBinarySearchTreeFromPreorderTraversalProblemTest {
    private final ConstructBinarySearchTreeFromPreorderTraversalProblem problem = new ConstructBinarySearchTreeFromPreorderTraversalProblem();

    @Test
    void example1() {
        // Input: preorder = [8,5,1,7,10,12]
        // Output: [8,5,10,1,7,null,12]
        int[] preorder = {8, 5, 1, 7, 10, 12};

        var root = problem.bstFromPreorder(preorder);

        assertEquals(8, root.val);
        assertEquals(5, root.left.val);
        assertEquals(1, root.left.left.val);
        assertEquals(7, root.left.right.val);
        assertEquals(10, root.right.val);
        assertEquals(12, root.right.right.val);
    }

    @Test
    void example2() {
        // Input: preorder = [1,3]
        // Output: [1,null,3]
        int[] preorder = {1, 3};

        var root = problem.bstFromPreorder(preorder);

        assertEquals(1, root.val);
        assertEquals(3, root.right.val);
    }
}
