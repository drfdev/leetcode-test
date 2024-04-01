package dev.drf.leetcode.convert.binary.number.in.a.linked.list.to.integer;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class ConvertBinaryNumberInALinkedListToIntegerProblem implements Problem {
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }

        int result = 0;
        ListNode cursor = head;
        while (cursor != null) {
            var value = cursor.val;
            result = (result << 1) + value;
            cursor = cursor.next;
        }

        return result;
    }
}
