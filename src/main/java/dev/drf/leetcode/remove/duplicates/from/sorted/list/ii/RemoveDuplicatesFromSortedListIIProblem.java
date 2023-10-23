package dev.drf.leetcode.remove.duplicates.from.sorted.list.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
 */
public class RemoveDuplicatesFromSortedListIIProblem implements Problem {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        int previousValue = head.val;
        ListNode cursor = head.next;
        ListNode previous = null;

        ListNode resultHead = null;
        ListNode resultCursor = null;

        int count = 1;

        while (cursor != null) {
            if (previousValue != cursor.val) {
                if (count == 1) {
                    ListNode newNode = new ListNode(previousValue);
                    if (resultCursor == null) {
                        resultCursor = newNode;
                        resultHead = resultCursor;
                    } else {
                        resultCursor.next = newNode;
                        resultCursor = resultCursor.next;
                    }
                }
                count = 1;
                previousValue = cursor.val;
            } else {
                count++;
            }

            cursor = cursor.next;
        }

        if (count == 1) {
            ListNode newNode = new ListNode(previousValue);
            if (resultCursor == null) {
                resultCursor = newNode;
                resultHead = resultCursor;
            } else {
                resultCursor.next = newNode;
            }
        }

        return resultHead;
    }
}
