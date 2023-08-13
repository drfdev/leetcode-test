package dev.drf.leetcode.clone.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CloneGraphProblemTest {
    private final CloneGraphProblem problem = new CloneGraphProblem();

    private static Node findNode(Node node, int value) {
        return node.neighbors.stream()
                .filter(it -> it.val == value)
                .findFirst()
                .orElse(null);
    }

    @Test
    void example1() {
        /*
        Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
        Output: [[2,4],[1,3],[2,4],[1,3]]
         */
        Node node1 = new Node(1, new ArrayList<>());
        Node node2 = new Node(2, new ArrayList<>());
        Node node3 = new Node(3, new ArrayList<>());
        Node node4 = new Node(4, new ArrayList<>());

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        var res1 = problem.cloneGraph(node1);

        assertEquals(1, res1.val);
        assertNotNull(res1.neighbors);
        assertEquals(2, res1.neighbors.size());

        Node res2 = findNode(res1, 2);
        Node res4 = findNode(res1, 4);

        assertNotNull(res2);
        assertNotNull(res4);

        assertNotNull(res2.neighbors);
        assertEquals(2, res2.neighbors.size());

        assertNotNull(res4.neighbors);
        assertEquals(2, res4.neighbors.size());

        assertSame(res1, findNode(res2, 1));
        assertSame(res1, findNode(res4, 1));

        Node res3 = findNode(res2, 3);
        assertNotNull(res3);
        assertSame(res3, findNode(res4, 3));

        assertNotNull(res3.neighbors);
        assertEquals(2, res3.neighbors.size());

        assertSame(res2, findNode(res3, 2));
        assertSame(res4, findNode(res3, 4));
    }

    @Test
    void example2() {
        /*
        Input: adjList = [[]]
        Output: [[]]
        ?? wtf ??
         */
        Node node1 = new Node(1);

        var res1 = problem.cloneGraph(node1);

        assertEquals(1, res1.val);
    }
}
