package dev.drf.leetcode.remove.nth.node.from.end.of.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthNodeFromEndOfListProblemTest {
    private final RemoveNthNodeFromEndOfListProblem problem = new RemoveNthNodeFromEndOfListProblem();

    private void assertListNode(ListNode head, int... values) {
        ListNode cursor = head;
        int index = 0;
        while (cursor != null) {
            assertEquals(values[index], cursor.val);
            index++;
            cursor = cursor.next;
        }
        assertEquals(values.length, index);
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        int n = 2;

        var result = problem.removeNthFromEnd(head, n);

        assertListNode(result, 1, 2, 3, 5);
    }

    @Test
    void example2() {
        /*
        Input: head = [1], n = 1
        Output: []
         */
        ListNode head = new ListNode(1);
        int n = 1;

        var result = problem.removeNthFromEnd(head, n);

        assertNull(result);
    }

    @Test
    void example3() {
        /*
        Input: head = [1,2], n = 1
        Output: [1]
         */
        ListNode head = new ListNode(1,
                new ListNode(2));
        int n = 1;

        var result = problem.removeNthFromEnd(head, n);

        assertListNode(result, 1);
    }

    @Test
    void myTest() {
        ListNode head = new ListNode(1,
                new ListNode(2));
        int n = 2;

        var result = problem.removeNthFromEnd(head, n);

        assertListNode(result, 2);
    }
}
