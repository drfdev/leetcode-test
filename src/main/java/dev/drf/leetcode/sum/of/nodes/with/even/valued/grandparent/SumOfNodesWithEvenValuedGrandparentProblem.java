package dev.drf.leetcode.sum.of.nodes.with.even.valued.grandparent;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent
 */
public class SumOfNodesWithEvenValuedGrandparentProblem implements Problem {
    public int sumEvenGrandparent(TreeNode root) {
        return sumForNode(root, -1, -1);
    }

    private int sumForNode(TreeNode node,
                           int parent,
                           int grandparent) {
        if (node == null) {
            return 0;
        }
        int sum = 0;
        if (grandparent % 2 == 0) {
            sum += node.val;
        }
        sum += sumForNode(node.left, node.val, parent);
        sum += sumForNode(node.right, node.val, parent);
        return sum;
    }
}
