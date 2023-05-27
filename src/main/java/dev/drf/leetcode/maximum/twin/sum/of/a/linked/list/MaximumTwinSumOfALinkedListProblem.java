package dev.drf.leetcode.maximum.twin.sum.of.a.linked.list;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */
public class MaximumTwinSumOfALinkedListProblem implements Problem {
    public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }

        List<Integer> vals = new ArrayList<>();
        ListNode cursor = head;
        while (cursor != null) {
            vals.add(cursor.val);
            cursor = cursor.next;
        }

        final int size = vals.size();
        final int step = size / 2;

        int maxResult = 0;
        for (int i = 0; i < step; i++) {
            int left = vals.get(i);
            int right = vals.get(size - i - 1);

            int sum = left + right;

            if (maxResult < sum) {
                maxResult = sum;
            }
        }

        return maxResult;
    }
}
