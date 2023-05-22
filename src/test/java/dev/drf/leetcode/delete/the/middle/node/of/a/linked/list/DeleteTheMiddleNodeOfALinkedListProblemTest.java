package dev.drf.leetcode.delete.the.middle.node.of.a.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeleteTheMiddleNodeOfALinkedListProblemTest {
    private final DeleteTheMiddleNodeOfALinkedListProblem problem = new DeleteTheMiddleNodeOfALinkedListProblem();

    private void assertListNode(ListNode result, int... values) {
        int index = 0;
        ListNode cursor = result;
        while (cursor != null) {
            assertEquals(values[index], cursor.val);

            cursor = cursor.next;
            index++;
        }

        assertEquals(values.length, index);
    }

    @Test
    void example1() {
        /*
        Input: head = [1,3,4,7,1,2,6]
        Output: [1,3,4,1,2,6]
         */
        ListNode head = new ListNode(1,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(7,
                                        new ListNode(1,
                                                new ListNode(2,
                                                        new ListNode(6)))))));

        var result = problem.deleteMiddle(head);

        assertListNode(result, 1, 3, 4, 1, 2, 6);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2,3,4]
        Output: [1,2,4]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        var result = problem.deleteMiddle(head);

        assertListNode(result, 1, 2, 4);
    }

    @Test
    void example3() {
        /*
        Input: head = [2,1]
        Output: [2]
         */
        ListNode head = new ListNode(2,
                new ListNode(1));

        var result = problem.deleteMiddle(head);

        assertListNode(result, 2);
    }

    @Test
    void failed1() {
        // [1]
        ListNode head = new ListNode(1);

        var result = problem.deleteMiddle(head);

        assertNull(result);
    }
}
