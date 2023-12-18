package dev.drf.leetcode.partition.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/partition-list/
 */
public class PartitionListProblem implements Problem {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode left = new ListNode();
        ListNode right = new ListNode();

        ListNode leftHead = left;
        ListNode rightHead = right;

        ListNode cursor = head;
        while (cursor != null) {
            var value = cursor.val;
            if (value < x) {
                left.next = cursor;
                left = left.next;
            } else {
                right.next = cursor;
                right = right.next;
            }

            cursor = cursor.next;
        }

        ListNode result = leftHead.next;
        if (result == null) {
            result = rightHead.next;
        } else {
            left.next = rightHead.next;
            if (left.next != null) {
                right.next = null;
            }
        }

        return result;
    }
}
