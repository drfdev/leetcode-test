package dev.drf.leetcode.binary.search.tree.iterator;

import dev.drf.leetcode.Problem;

import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-search-tree-iterator/
 * Used solution:
 * https://leetcode.com/problems/binary-search-tree-iterator/solutions/52525/my-solutions-in-3-languages-with-stack
 */
public class BinarySearchTreeIteratorProblem implements Problem {
    public static class BSTIterator {
        private Stack<TreeNode> stack = new Stack<>();


        public BSTIterator(TreeNode root) {
            pushAll(root);
        }

        public int next() {
            TreeNode tmpNode = stack.pop();
            pushAll(tmpNode.right);
            return tmpNode.val;

        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        private void pushAll(TreeNode node) {
//            for (; node != null; stack.push(node), node = node.left);
            TreeNode cursor = node;
            while (cursor != null) {
                stack.push(cursor);
                cursor = cursor.left;
            }
        }
    }
}
