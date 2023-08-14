package dev.drf.leetcode.linked.list.cycle.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCycleIIProblemTest {
    private final LinkedListCycleIIProblem problem = new LinkedListCycleIIProblem();

    @Test
    void example1() {
        /*
        Input: head = [3,2,0,-4], pos = 1
        Output: tail connects to node index 1
         */
        var head = new ListNode(3);
        var node1 = new ListNode(2);
        var node2 = new ListNode(0);
        var node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        var result = problem.detectCycle(head);

        assertNotNull(result);
        assertEquals(2, result.val);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2], pos = 0
        Output: tail connects to node index 0
         */
        var head = new ListNode(1);
        var node1 = new ListNode(2);

        head.next = node1;
        node1.next = head;

        var result = problem.detectCycle(head);

        assertNotNull(result);
        assertEquals(1, result.val);
    }

    @Test
    void example3() {
        /*
        Input: head = [1], pos = -1
        Output: no cycle
         */
        var head = new ListNode(1);

        var result = problem.detectCycle(head);

        assertNull(result);
    }

    @Test
    void failed1() {
        // [-1,-7,7,-4,19,6,-9,-5,-2,-5]
        // 6
        var head = new ListNode(-1);
        var node1 = new ListNode(-7);
        var node2 = new ListNode(7);
        var node3 = new ListNode(-4);
        var node4 = new ListNode(19);
        var node5 = new ListNode(6);
        var node6 = new ListNode(-9);
        var node7 = new ListNode(-5);
        var node8 = new ListNode(-2);
        var node9 = new ListNode(-5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        node9.next = node7;

        var result = problem.detectCycle(head);

        assertNotNull(result);
        assertEquals(-5, result.val);
        assertSame(node7, result);
    }
}
