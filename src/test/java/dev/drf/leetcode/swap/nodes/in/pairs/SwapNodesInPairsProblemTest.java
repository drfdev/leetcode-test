package dev.drf.leetcode.swap.nodes.in.pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SwapNodesInPairsProblemTest {
    private final SwapNodesInPairsProblem problem = new SwapNodesInPairsProblem();

    private void assertListNode(ListNode swapped, int... values) {
        ListNode cursor = swapped;
        int index = 0;

        while (cursor != null) {
            assertEquals(cursor.val, values[index]);

            cursor = cursor.next;
            index++;
        }

        assertEquals(index, values.length);
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4]
        Output: [2,1,4,3]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        var swapped = problem.swapPairs(head);

        assertListNode(swapped, 2, 1, 4, 3);
    }

    @Test
    void example2() {
        /*
        Input: head = []
        Output: []
         */
        ListNode head = null;

        var swapped = problem.swapPairs(head);

        assertNull(swapped);
    }

    @Test
    void example3() {
        /*
        Input: head = [1]
        Output: [1]
         */
        ListNode head = new ListNode(1);

        var swapped = problem.swapPairs(head);

        assertListNode(swapped, 1);
    }
}
