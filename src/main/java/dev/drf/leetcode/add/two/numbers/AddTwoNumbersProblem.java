package dev.drf.leetcode.add.two.numbers;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbersProblem implements Problem {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode result = null;
        var cursor = new ListNode();
        var cursor1 = l1;
        var cursor2 = l2;
        int remember = 0;

        while (cursor1 != null || cursor2 != null || remember > 0) {
            var value1 = getNodeValue(cursor1);
            var value2 = getNodeValue(cursor2);

            var fullValue = value1 + value2 + remember;
            var nextValue = fullValue % 10;
            cursor.next = new ListNode(nextValue);
            if (result == null) {
                result = cursor.next;
            }

            remember = (fullValue - nextValue) / 10;
            cursor = cursor.next;
            cursor1 = getNextNode(cursor1);
            cursor2 = getNextNode(cursor2);
        }

        return result;
    }

    private int getNodeValue(ListNode node) {
        return node != null ? node.val : 0;
    }

    private ListNode getNextNode(ListNode node) {
        if (node != null) {
            return node.next;
        }
        return null;
    }
}
