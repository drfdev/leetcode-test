package dev.drf.leetcode.find.a.corresponding.node.of.a.binary.tree.in.a.clone.of.that.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeProblem implements Problem {
    public final TreeNode getTargetCopy(final TreeNode original,
                                        final TreeNode cloned,
                                        final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }
        var leftValue = getTargetCopy(original.left, cloned.left, target);
        var rightValue = getTargetCopy(original.right, cloned.right, target);

        if (leftValue != null) {
            return leftValue;
        }
        if (rightValue != null) {
            return rightValue;
        }

        return null;
    }
}
