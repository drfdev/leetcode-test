package dev.drf.leetcode.partition.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PartitionListProblemTest {
    private final PartitionListProblem problem = new PartitionListProblem();

    private static void assertListNode(ListNode result, int... values) {
        assertNotNull(result);
        ListNode cursor = result;
        int length = 0;

        while (cursor != null) {
            assertEquals(values[length], cursor.val);
            length++;
            cursor = cursor.next;
        }

        assertEquals(length, values.length);
    }

    @Test
    void example1() {
        /*
        Input: head = [1,4,3,2,5,2], x = 3
        Output: [1,2,2,4,3,5]
         */
        ListNode head = new ListNode(1,
                new ListNode(4,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(2))))));

        var result = problem.partition(head, 3);

        assertListNode(result, 1, 2, 2, 4, 3, 5);
    }

    @Test
    void example2() {
        /*
        Input: head = [2,1], x = 2
        Output: [1,2]
         */
        ListNode head = new ListNode(2,
                new ListNode(1));

        var result = problem.partition(head, 2);

        assertListNode(result, 1, 2);
    }
}
