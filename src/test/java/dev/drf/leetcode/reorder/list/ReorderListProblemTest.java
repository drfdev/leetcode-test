package dev.drf.leetcode.reorder.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorderListProblemTest {
    private final ReorderListProblem problem = new ReorderListProblem();

    private void assertListNode(ListNode head, int... values) {
        ListNode cursor = head;
        int index = 0;
        while (cursor != null) {
            assertEquals(values[index], cursor.val);
            cursor = cursor.next;
            index++;
        }

        assertEquals(index, values.length);
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4]
        Output: [1,4,2,3]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        problem.reorderList(head);

        assertListNode(head, 1, 4, 2, 3);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2,3,4,5]
        Output: [1,5,2,4,3]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        problem.reorderList(head);

        assertListNode(head, 1, 5, 2, 4, 3);
    }
}
