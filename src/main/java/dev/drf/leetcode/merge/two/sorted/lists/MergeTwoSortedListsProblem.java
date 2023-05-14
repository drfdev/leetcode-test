package dev.drf.leetcode.merge.two.sorted.lists;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedListsProblem implements Problem {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode left = list1;
        ListNode right = list2;

        ListNode first = getMin(left, right);

        ListNode result = new ListNode(first.val);
        ListNode cursor = result;

        if (first == left) {
            left = left.next;
        } else {
            right = right.next;
        }

        while (left != null || right != null) {
            ListNode min = getMin(left, right);

            cursor.next = new ListNode(min.val);

            if (min == left) {
                left = left.next;
            } else {
                right = right.next;
            }

            cursor = cursor.next;
        }

        return result;
    }

    private ListNode getMin(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        }

        return left.val < right.val
                ? left : right;
    }
}
