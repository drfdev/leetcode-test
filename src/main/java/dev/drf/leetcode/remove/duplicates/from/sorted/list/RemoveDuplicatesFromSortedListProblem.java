package dev.drf.leetcode.remove.duplicates.from.sorted.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesFromSortedListProblem implements Problem {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cursor = head;
        ListNode result = head;
        ListNode resultCursor = head;

        while (cursor != null) {
            if (resultCursor.val != cursor.val) {
                resultCursor.next = cursor;
                resultCursor = resultCursor.next;
            }

            cursor = cursor.next;
        }

        if (resultCursor != null) {
            resultCursor.next = null;
        }

        return result;
    }
}
