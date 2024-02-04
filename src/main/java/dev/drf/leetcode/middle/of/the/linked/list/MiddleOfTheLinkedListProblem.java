package dev.drf.leetcode.middle.of.the.linked.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedListProblem implements Problem {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }

        ListNode slowCursor = head;
        ListNode fastCursor = head;

        while (fastCursor.next != null) {
            slowCursor = slowCursor.next;
            fastCursor = fastCursor.next;

            if (fastCursor.next == null) {
                break;
            }
            fastCursor = fastCursor.next;
        }

        return slowCursor;
    }
}
