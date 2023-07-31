package dev.drf.leetcode.reverse.linked.list.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReverseLinkedListIIProblemTest {
    private final ReverseLinkedListIIProblem problem = new ReverseLinkedListIIProblem();

    private void assertListNode(ListNode listNode, int... values) {
        assertNotNull(listNode);
        var cursor = listNode;
        var index = 0;

        if (values == null || values.length == 0) {
            return;
        }

        while (cursor != null) {
            assertEquals(values[index], cursor.val);

            cursor = cursor.next;
            index++;
        }
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4,5], left = 2, right = 4
        Output: [1,4,3,2,5]
         */
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        int left = 2;
        int right = 4;

        var res = problem.reverseBetween(head, left, right);

        assertListNode(res, 1, 4, 3, 2, 5);
    }

    @Test
    void example2() {
        /*
        Input: head = [5], left = 1, right = 1
        Output: [5]
         */
        ListNode head = new ListNode(5);
        int left = 1;
        int right = 1;

        var res = problem.reverseBetween(head, left, right);

        assertListNode(res, 5);
    }

    @Test
    void failed1() {
        // head = [1,2,3]
        // 3 / 3
        // [1,2,3]
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));
        int left = 3;
        int right = 3;

        var res = problem.reverseBetween(head, left, right);

        assertListNode(res, 1, 2, 3);
    }

    @Test
    void failed2() {
        // head = [1,2,3]
        // 1 / 1
        // [1,2,3]
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));
        int left = 1;
        int right = 1;

        var res = problem.reverseBetween(head, left, right);

        assertListNode(res, 1, 2, 3);
    }
}
