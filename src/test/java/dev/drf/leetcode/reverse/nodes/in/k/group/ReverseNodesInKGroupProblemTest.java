package dev.drf.leetcode.reverse.nodes.in.k.group;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNodesInKGroupProblemTest {
    private final ReverseNodesInKGroupProblem problem = new ReverseNodesInKGroupProblem();

    private void assertListNode(ListNode node, int... values) {
        int index = 0;
        ListNode cursor = node;

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
        Input: head = [1,2,3,4,5], k = 2
        Output: [2,1,4,3,5]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        int k = 2;

        var node = problem.reverseKGroup(head, k);

        assertListNode(node, 2, 1, 4, 3, 5);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2,3,4,5], k = 3
        Output: [3,2,1,4,5]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        int k = 3;

        var node = problem.reverseKGroup(head, k);

        assertListNode(node, 3, 2, 1, 4, 5);
    }
}
