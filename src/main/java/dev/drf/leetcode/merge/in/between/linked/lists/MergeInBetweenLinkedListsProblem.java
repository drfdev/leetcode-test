package dev.drf.leetcode.merge.in.between.linked.lists;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/merge-in-between-linked-lists/
 */
public class MergeInBetweenLinkedListsProblem implements Problem {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // 3 <= list1.length <= 104
        // 1 <= a <= b < list1.length - 1
        // 1 <= list2.length <= 104

        ListNode aNode = null;
        ListNode bNode = null;

        int index = 0;
        int aIndex = a - 1;
        int bIndex = b + 1;
        ListNode cursor = list1;
        while (cursor != null) {
            if (index == aIndex) {
                aNode = cursor;
            } else if (index == bIndex) {
                bNode = cursor;
                break;
            }

            cursor = cursor.next;
            index++;
        }

        cursor = list2;
        while (cursor != null) {
            if (cursor.next == null) {
                break;
            }
            cursor = cursor.next;
        }

        aNode.next = list2;
        cursor.next = bNode;

        return list1;
    }
}
