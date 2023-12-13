package dev.drf.leetcode.populating.next.right.pointers.in.each.node.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulatingNextRightPointersInEachNodeIIProblemTest {
    private final PopulatingNextRightPointersInEachNodeIIProblem problem = new PopulatingNextRightPointersInEachNodeIIProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3,4,5,null,7]
        Output: [1,#,2,3,#,4,5,7,#]
         */
        Node root = new Node(1,
                new Node(2,
                        new Node(4),
                        new Node(5),
                        null),
                new Node(3,
                        null,
                        new Node(7),
                        null),
                null);

        var node = problem.connect(root);

        assertNull(node.next);
        assertEquals(3, node.left.next.val);
        assertNull(node.right.next);
        assertEquals(5, node.left.left.next.val);
        assertEquals(7, node.left.right.next.val);
        assertNull(node.right.right.next);
    }

    @Test
    void example2() {
        /*
        Input: root = []
        Output: []
         */
        Node root = null;

        var node = problem.connect(root);

        assertNull(node);
    }

    @Test
    void failed1() {
        /*
        root = [1,2,3,4,null,null,5]
         */
        Node root = new Node(1,
                new Node(2,
                        new Node(4),
                        null,
                        null),
                new Node(3,
                        null,
                        new Node(5),
                        null),
                null);

        var node = problem.connect(root);

        assertNull(node.next);
        assertEquals(3, node.left.next.val);
        assertNull(node.right.next);
        assertEquals(5, node.left.left.next.val);
        assertNull(node.right.right.next);
    }

    @Test
    void failed2() {
        /*
        [2,1,3,0,7,9,1,2,null,1,0,null,null,8,8,null,null,null,null,7]
         */
        Node root = new Node(2,
                new Node(1,
                        new Node(0,
                                new Node(2),
                                null,
                                null),
                        new Node(7,
                                new Node(1),
                                new Node(0,
                                        new Node(7),
                                        null,
                                        null),
                                null),
                        null),
                new Node(3,
                        new Node(9),
                        new Node(1,
                                new Node(8),
                                new Node(8),
                                null),
                        null),
                null);

        var node = problem.connect(root);

        assertNull(node.next);
        assertEquals(3, node.left.next.val);
        assertEquals(7, node.left.left.next.val);
        assertEquals(1, node.left.left.left.next.val);

        assertEquals(9, node.left.right.next.val);
        assertEquals(0, node.left.right.left.next.val);
        assertEquals(8, node.left.right.right.next.val);

        assertEquals(1, node.right.left.next.val);
        assertEquals(8, node.right.right.left.next.val);
    }
}
