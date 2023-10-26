package dev.drf.leetcode.sort.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sort-list/
 * Used algorithm: https://en.wikipedia.org/wiki/Merge_sort
 */
public class SortListProblem implements Problem {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode previous = null;
        ListNode left = head;
        ListNode right = head;

        while (right != null && right.next != null) {
            previous = left;
            left = left.next;
            right = right.next.next;
        }

        previous.next = null;

        ListNode leftNode = sortList(head);
        ListNode rightNode = sortList(left);

        return merge(leftNode, rightNode);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode tempHead = new ListNode(0);
        ListNode cursore = tempHead;

        while (left != null && right != null) {
            if (left.val < right.val) {
                cursore.next = left;
                left = left.next;
            } else {
                cursore.next = right;
                right = right.next;
            }
            cursore = cursore.next;
        }

        if (left != null) {
            cursore.next = left;
        } else if (right != null) {
            cursore.next = right;
        }

        return tempHead.next;
    }
}
