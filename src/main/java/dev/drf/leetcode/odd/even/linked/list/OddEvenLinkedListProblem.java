package dev.drf.leetcode.odd.even.linked.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedListProblem implements Problem {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = null;

        ListNode odd = head;
        ListNode even = null;

        int index = 2;
        ListNode cursor = head.next;

        while (cursor != null) {
            if (index % 2 == 0) {
                if (even == null) {
                    even = cursor;
                    evenHead = even;
                } else {
                    even.next = cursor;
                    even = even.next;
                }
            } else {
                odd.next = cursor;
                odd = odd.next;
            }

            cursor = cursor.next;
            index++;
        }

        even.next = null;
        odd.next = evenHead;

        return oddHead;
    }
}
