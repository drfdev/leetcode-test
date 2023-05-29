package dev.drf.leetcode.delete.node.in.a.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeleteNodeInABstProblemTest {
    private final DeleteNodeInABstProblem2 problem = new DeleteNodeInABstProblem2();

    private void printNodes(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val);
        System.out.print(",");
        printNodes(node.left);
        printNodes(node.right);
    }

    @Test
    void example1() {
        /*
        Input: root = [5,3,6,2,4,null,7], key = 3
        Output: [5,4,6,2,null,null,7]
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));

        var node = problem.deleteNode(root, 3);

        assertNotNull(node);
        printNodes(node);
    }

    @Test
    void example2() {
        /*
        Input: root = [5,3,6,2,4,null,7], key = 0
        Output: [5,3,6,2,4,null,7]
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));

        var node = problem.deleteNode(root, 0);

        assertNotNull(node);
        printNodes(node);
    }

    @Test
    void example3() {
        /*
        Input: root = [], key = 0
        Output: []
         */
        TreeNode root = null;

        var node = problem.deleteNode(root, 0);

        assertNull(node);
    }
}
