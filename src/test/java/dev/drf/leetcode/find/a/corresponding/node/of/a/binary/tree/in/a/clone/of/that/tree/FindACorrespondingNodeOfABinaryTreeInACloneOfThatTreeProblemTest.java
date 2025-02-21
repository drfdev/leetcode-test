package dev.drf.leetcode.find.a.corresponding.node.of.a.binary.tree.in.a.clone.of.that.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeProblemTest {
    private final FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeProblem problem = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeProblem();

    @Test
    void example1() {
        // Input: tree = [7,4,3,null,null,6,19], target = 3
        // Output: 3
        var tree = new TreeNode(7);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(3);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(19);

        var node = problem.getTargetCopy(tree, tree, tree.right);

        assertSame(tree.right, node);
    }

    @Test
    void example2() {
        // Input: tree = [7], target =  7
        // Output: 7
        var tree = new TreeNode(7);

        var node = problem.getTargetCopy(tree, tree, tree);

        assertSame(tree, node);
    }

    @Test
    void example3() {
        // Input: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
        // Output: 4
        var tree = new TreeNode(8);
        tree.right = new TreeNode(6);
        tree.right.right = new TreeNode(5);
        tree.right.right.right = new TreeNode(4);
        tree.right.right.right.right = new TreeNode(3);
        tree.right.right.right.right.right = new TreeNode(2);
        tree.right.right.right.right.right.right = new TreeNode(1);

        var node = problem.getTargetCopy(tree, tree, tree.right.right.right);

        assertSame(tree.right.right.right, node);
    }
}
