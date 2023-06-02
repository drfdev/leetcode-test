package dev.drf.leetcode.reorder.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reorder-list/
 */
public class ReorderListProblem implements Problem {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode cursor = head;
        while (cursor != null) {
            ListNode last = unboundLast(cursor);

            ListNode next = cursor.next;
            cursor.next = last;
            last.next = next;

            cursor = next;
        }
    }

    private ListNode unboundLast(ListNode cursor) {
        ListNode pr = null;
        ListNode last = cursor;
        ListNode lastCursor = last.next;

        while (lastCursor != null) {
            pr = last;
            last = lastCursor;
            lastCursor = lastCursor.next;
        }

        if (pr != null) {
            pr.next = null;
        }

        return last;
    }
}
