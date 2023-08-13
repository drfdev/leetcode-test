package dev.drf.leetcode.clone.graph;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/clone-graph/
 */
public class CloneGraphProblem implements Problem {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Integer, Node> nodes = new HashMap<>();
        return cloneNode(node, nodes);
    }

    private Node cloneNode(Node node,
                           Map<Integer, Node> nodes) {
        if (nodes.containsKey(node.val)) {
            return nodes.get(node.val);
        }
        Node cloned = new Node(node.val, new ArrayList<>());
        nodes.put(node.val, cloned);
        for (Node neighbor : node.neighbors) {
            cloned.neighbors.add(cloneNode(neighbor, nodes));
        }
        return cloned;
    }
}
