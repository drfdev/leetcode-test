package dev.drf.leetcode.odd.even.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvenLinkedListProblemTest {
    private final OddEvenLinkedListProblem problem = new OddEvenLinkedListProblem();

    private void assertListNode(ListNode result, int... values) {
        var cursor = result;
        int index = 0;
        while (cursor != null) {
            assertEquals(values[index], cursor.val);
            cursor = cursor.next;
            index++;
        }
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4,5]
        Output: [1,3,5,2,4]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        var result = problem.oddEvenList(head);

        assertListNode(result, 1, 3, 5, 2, 4);
    }

    @Test
    void example2() {
        /*
        Input: head = [2,1,3,5,6,4,7]
        Output: [2,3,6,7,1,5,4]
         */
        ListNode head = new ListNode(2,
                new ListNode(1,
                        new ListNode(3,
                                new ListNode(5,
                                        new ListNode(6,
                                                new ListNode(4,
                                                        new ListNode(7)))))));

        var result = problem.oddEvenList(head);

        assertListNode(result, 2, 3, 6, 7, 1, 5, 4);
    }
}
