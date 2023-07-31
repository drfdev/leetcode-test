package dev.drf.leetcode.reverse.linked.list.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseLinkedListIIProblem implements Problem {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }

        ListNode previous = null;
        ListNode current = null;

        ListNode firstPart = null;
        ListNode result = null;
        ListNode resultLast = null;
        ListNode lastPart = null;
        ListNode lastPartHead = null;
        var cursor = head;

        ListNode resultHead = null;

        int index = 0;

        while (cursor != null) {
            current = cursor;
            index++;

            if (index < left) {
                if (firstPart == null) {
                    firstPart = cursor;
                    resultHead = cursor;
                } else {
                    firstPart.next = cursor;
                    firstPart = firstPart.next;
                }
                cursor = cursor.next;
            } else if (index >= left && index <= right) {
                cursor = cursor.next;

                previous = result;
                result = current;
                if (resultLast == null) {
                    resultLast = result;
                }
                result.next = null;
                if (previous != null) {
                    result.next = previous;
                }
            } else if (index > right) {
                if (lastPart == null) {
                    lastPart = cursor;
                    lastPartHead = cursor;
                } else {
                    lastPart.next = cursor;
                    lastPart = lastPart.next;
                }
                cursor = cursor.next;
            }
        }

        if (firstPart != null) {
            firstPart.next = result;
        } else {
            resultHead = result;
        }

        if (lastPartHead != null) {
            resultLast.next = lastPartHead;
        }


        return resultHead;
    }
}
