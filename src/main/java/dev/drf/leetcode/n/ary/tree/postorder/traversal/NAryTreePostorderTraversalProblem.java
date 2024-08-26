package dev.drf.leetcode.n.ary.tree.postorder.traversal;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class NAryTreePostorderTraversalProblem implements Problem {
    public List<Integer> postorder(Node root) {
        var result = new ArrayList<Integer>();
        processNode(result, root);
        return result;
    }

    private void processNode(ArrayList<Integer> result,
                             Node node) {
        if (node == null) {
            return;
        }
        var children = node.children;
        if (children != null && !children.isEmpty()) {
            for (Node child : children) {
                processNode(result, child);
            }
        }
        result.add(node.val);
    }
}
