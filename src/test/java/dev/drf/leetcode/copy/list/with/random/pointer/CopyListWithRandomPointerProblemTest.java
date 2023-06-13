package dev.drf.leetcode.copy.list.with.random.pointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CopyListWithRandomPointerProblemTest {
    private final CopyListWithRandomPointerProblem problem = new CopyListWithRandomPointerProblem();

    @Test
    void example1() {
        /*
        Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
        Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
         */
        Node node0 = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = node0;
        node2.random = node4;
        node3.random = node2;
        node4.random = node0;

        var res = problem.copyRandomList(node0);

        var res0 = res;
        var res1 = res.next;
        var res2 = res.next.next;
        var res3 = res.next.next.next;
        var res4 = res.next.next.next.next;

        // [7,null],
        assertEquals(7, res0.val);
        assertNull(res0.random);

        // [13,0],
        assertEquals(13, res1.val);
        assertEquals(res0, res1.random);

        // [11,4],
        assertEquals(11, res2.val);
        assertEquals(res4, res2.random);

        // [10,2],
        assertEquals(10, res3.val);
        assertEquals(res2, res3.random);

        // [1,0]
        assertEquals(1, res4.val);
        assertEquals(res0, res4.random);
    }

    @Test
    void example2() {
        /*
        Input: head = [[1,1],[2,1]]
        Output: [[1,1],[2,1]]
         */
        Node node0 = new Node(1);
        Node node1 = new Node(2);

        node0.next = node1;

        node0.random = node1;
        node1.random = node1;

        var res = problem.copyRandomList(node0);

        var res0 = res;
        var res1 = res.next;

        // [1,1],
        assertEquals(1, res0.val);
        assertEquals(res1, res0.random);

        // [2,1]
        assertEquals(2, res1.val);
        assertEquals(res1, res1.random);
    }

    @Test
    void example3() {
        /*
        Input: head = [[3,null],[3,0],[3,null]]
        Output: [[3,null],[3,0],[3,null]]
         */
        Node node0 = new Node(3);
        Node node1 = new Node(3);
        Node node2 = new Node(3);

        node0.next = node1;
        node1.next = node2;

        node1.random = node0;

        var res = problem.copyRandomList(node0);

        var res0 = res;
        var res1 = res.next;
        var res2 = res.next.next;

        // [3,null],
        assertEquals(3, res0.val);
        assertNull(res0.random);

        // [3,0],
        assertEquals(3, res1.val);
        assertEquals(res0, res1.random);

        // [3,null]
        assertEquals(3, res2.val);
        assertNull(res2.random);
    }
}
