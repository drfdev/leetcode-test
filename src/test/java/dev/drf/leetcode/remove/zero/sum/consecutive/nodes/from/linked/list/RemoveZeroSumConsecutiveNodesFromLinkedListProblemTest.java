package dev.drf.leetcode.remove.zero.sum.consecutive.nodes.from.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveZeroSumConsecutiveNodesFromLinkedListProblemTest {
    private final RemoveZeroSumConsecutiveNodesFromLinkedListProblem problem = new RemoveZeroSumConsecutiveNodesFromLinkedListProblem();

    @Test
    void example1() {
        /*
        Input: head = [1,2,-3,3,1]
        Output: [3,1]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(-3,
                                new ListNode(3,
                                        new ListNode(1)))));

        var result = problem.removeZeroSumSublists(head);

        assertEquals(3, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2,3,-3,4]
        Output: [1,2,4]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(-3,
                                        new ListNode(4)))));

        var result = problem.removeZeroSumSublists(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(4, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void example3() {
        /*
        Input: head = [1,2,3,-3,-2]
        Output: [1]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(-3,
                                        new ListNode(-2)))));

        var result = problem.removeZeroSumSublists(head);

        assertEquals(1, result.val);
        assertNull(result.next);
    }
}
