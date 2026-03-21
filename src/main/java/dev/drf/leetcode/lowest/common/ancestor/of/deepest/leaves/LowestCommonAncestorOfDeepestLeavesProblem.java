package dev.drf.leetcode.lowest.common.ancestor.of.deepest.leaves;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
 */
public class LowestCommonAncestorOfDeepestLeavesProblem implements Problem {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        // node.val -> parent
        HashMap<Integer, TreeNode> map = new HashMap<>();
        LCAContainer lca = new LCAContainer();
        findLCA(map, lca, root, null, 0);
        return findLCAByNodes(lca, map);
    }

    private void findLCA(HashMap<Integer, TreeNode> map,
                             LCAContainer lca,
                             TreeNode node,
                             TreeNode parent,
                             int depth) {
        if (node == null) {
            return;
        }
        map.put(node.val, parent);

        if (lca.depth < depth) {
            lca.depth = depth;
            lca.values.clear();
            lca.values.add(node);
        } else if (lca.depth == depth) {
            lca.values.add(node);
        }

        final int nextDepth = depth + 1;
        findLCA(map, lca, node.left, node, nextDepth);
        findLCA(map, lca, node.right, node, nextDepth);
    }

    private TreeNode findLCAByNodes(LCAContainer lca,
                                    HashMap<Integer, TreeNode> map) {
        if (lca.values.size() == 1) {
            return lca.values.get(0);
        }
        Set<TreeNode> parents = new HashSet<>(lca.values.size());
        List<TreeNode> values = lca.values;

        while (values.size() > 1) {
            for (TreeNode value : values) {
                parents.add(map.get(value.val));
            }

            values.clear();
            values.addAll(parents);
            parents.clear();
        }

        return values.get(0);
    }

    private static final class LCAContainer {
        public int depth;
        public List<TreeNode> values = new ArrayList<>();
    }
}
