package dev.drf.leetcode.kth.smallest.element.in.a.bst;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * Used solution:
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/solutions/63660/3-ways-implemented-in-java-python-binary-search-in-order-iterative-recursive/
 */
public class KthSmallestElementInABstProblem2 {
    public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            return kthSmallest(root.right, k - 1 - count); // 1 is counted as current node
        }

        return root.val;
    }

    public int countNodes(TreeNode n) {
        if (n == null) {
            return 0;
        }

        return 1 + countNodes(n.left) + countNodes(n.right);
    }
}
