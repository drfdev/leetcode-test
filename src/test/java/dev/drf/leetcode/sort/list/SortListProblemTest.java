package dev.drf.leetcode.sort.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SortListProblemTest {
    private final SortListProblem problem = new SortListProblem();

    private static void assertListNode(ListNode sorted, int... values) {
        var cursor = sorted;
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
        Input: head = [4,2,1,3]
        Output: [1,2,3,4]
         */
        var head = new ListNode(4,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3))));

        var sorted = problem.sortList(head);

        assertListNode(sorted, 1, 2, 3, 4);
    }

    @Test
    void example2() {
        /*
        Input: head = [-1,5,3,4,0]
        Output: [-1,0,3,4,5]
         */
        var head = new ListNode(-1,
                new ListNode(5,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(0)))));

        var sorted = problem.sortList(head);

        assertListNode(sorted, -1, 0, 3, 4, 5);
    }

    @Test
    void example3() {
        /*
        Input: head = []
        Output: []
         */
        ListNode head = null;

        var sorted = problem.sortList(head);

        assertNull(sorted);
    }
}
