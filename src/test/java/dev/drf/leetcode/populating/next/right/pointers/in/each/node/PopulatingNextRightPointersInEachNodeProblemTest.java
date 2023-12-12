package dev.drf.leetcode.populating.next.right.pointers.in.each.node;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulatingNextRightPointersInEachNodeProblemTest {
    private final PopulatingNextRightPointersInEachNodeProblem problem = new PopulatingNextRightPointersInEachNodeProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3,4,5,6,7]
        Output: [1,#,2,3,#,4,5,6,7,#]
         */
        var root = new Node(1,
                new Node(2,
                        new Node(4),
                        new Node(5),
                        null),
                new Node(3,
                        new Node(6),
                        new Node(7),
                        null),
                null);

        var res = problem.connect(root);

        assertNull(res.next);
        assertEquals(3, res.left.next.val);
        assertNull(res.right.next);
        assertEquals(5, res.left.left.next.val);
        assertEquals(6, res.left.right.next.val);
        assertEquals(7, res.right.left.next.val);
        assertNull(res.right.right.next);
    }

    @Test
    void example2() {
        /*
        Input: root = []
        Output: []
         */
        Node root = null;

        var res = problem.connect(root);

        assertNull(res);
    }
}
