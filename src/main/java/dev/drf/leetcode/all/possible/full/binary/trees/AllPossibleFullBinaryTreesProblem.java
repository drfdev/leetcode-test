package dev.drf.leetcode.all.possible.full.binary.trees;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/all-possible-full-binary-trees/
 * Used solution:
 * https://leetcode.com/problems/all-possible-full-binary-trees/solutions/167402/c-c-java-python-recursive-and-iterative-solutions-doesn-t-create-frankenstein-trees/
 */
public class AllPossibleFullBinaryTreesProblem implements Problem {
    public List<TreeNode> allPossibleFBT(int n) {
        if (n == 1) {
            return List.of(new TreeNode());
        }
        if (n % 2 == 0) {
            return Collections.emptyList();
        }

        List<TreeNode> trees = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            List<TreeNode> leftTrees = allPossibleFBT( i - 1);
            List<TreeNode> rightTrees = allPossibleFBT(n - i);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode tree = new TreeNode();

                    tree.left = cloneTreeNode(left);
                    tree.right = cloneTreeNode(right);

                    trees.add(tree);
                }
            }
        }

        return trees;
    }

    private TreeNode cloneTreeNode(TreeNode tree) {
        if (tree == null) {
            return null;
        }

        TreeNode newTree = new TreeNode(tree.val);
        newTree.left = cloneTreeNode(tree.left);
        newTree.right = cloneTreeNode(tree.right);

        return newTree;
    }
}
