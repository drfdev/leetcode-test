package dev.drf.leetcode.rotate.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/rotate-list/
 */
public class RotateListProblem implements Problem {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        if (k == 0) {
            return head;
        }

        int size = 0;
        ListNode cursor = head;
        while (cursor != null) {
            cursor = cursor.next;
            size++;
        }

        if (k == size) {
            return head;
        }
        if (k > size) {
            k = k % size;
        }
        if (k == 0) {
            return head;
        }

        int searched = size - k;
        int index = 0;
        cursor = head;
        ListNode pr = null;
        ListNode node = null;

        while (cursor != null) {
            pr = cursor;
            cursor = cursor.next;
            index++;
            if (searched == index) {
                node = cursor;
                break;
            }
        }

        pr.next = null;

        cursor = node;
        while (cursor != null) {
            if (cursor.next == null) {
                cursor.next = head;
                break;
            }
            cursor = cursor.next;
        }

        return node;
    }
}
