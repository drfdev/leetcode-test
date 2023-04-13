package dev.drf.leetcode.linked.list.cycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleProblemTest {
    private final LinkedListCycleProblem problem = new LinkedListCycleProblem();

    @Test
    void example1() {
        /*
        Input: head = [3,2,0,-4], pos = 1
        Output: true
         */
        var head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // cycle here

        var result = problem.hasCycle(head);

        assertTrue(result);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2], pos = 0
        Output: true
         */
        var head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head; // cycle

        var result = problem.hasCycle(head);

        assertTrue(result);
    }

    @Test
    void example3() {
        /*
        Input: head = [1], pos = -1
        Output: false
         */
        var head = new ListNode(1);

        var result = problem.hasCycle(head);

        assertFalse(result);
    }

    @Test
    void myTest1() {
        var head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);

        var result = problem.hasCycle(head);

        assertFalse(result);
    }

    @Test
    void myTest2() {
        var head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next; // cycle here

        var result = problem.hasCycle(head);

        assertTrue(result);
    }
}
