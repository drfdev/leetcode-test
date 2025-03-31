package dev.drf.leetcode.insert.greatest.common.divisors.in.linked.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
 */
public class InsertGreatestCommonDivisorsInLinkedListProblem implements Problem {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }

        var current = head;
        var next = head.next;

        while (next != null) {
            var gkdValue = gkd(current.val, next.val);

            var gkdNode = new ListNode(gkdValue);
            current.next = gkdNode;
            gkdNode.next = next;

            current = next;
            next = next.next;
        }

        return head;
    }

    private int gkd(int first, int second) {
        // Euclid’s Algorithm
        if (second == 0) {
            return first;
        }
        return gkd(second, first % second);
    }
}
