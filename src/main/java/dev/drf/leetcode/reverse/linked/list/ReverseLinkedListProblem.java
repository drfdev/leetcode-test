package dev.drf.leetcode.reverse.linked.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedListProblem implements Problem {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode previous = null;
        ListNode current = null;

        ListNode result = null;
        var cursor = head;

        while (cursor != null) {
            current = cursor;

            cursor = cursor.next;

            previous = result;
            result = current;
            result.next = null;
            if (previous != null) {
                result.next = previous;
            }
        }

        return result;
    }

}
