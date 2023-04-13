package dev.drf.leetcode.merge.k.sorted.lists;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedListsProblem implements Problem {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        if (lists.length == 0) {
            return null;
        }

        Arrays.sort(lists, Comparator.nullsFirst(Comparator.comparingInt(o -> o.val)));

        var index = findFirstNotNull(lists);

        if (index == -1) {
            return null;
        }

        ListNode result = new ListNode(lists[index].val);
        var cursor = result;
        index = moveByIndex(lists, index);

        while (index < lists.length) {
            var iList = lists[index];
            cursor.next = new ListNode(iList.val);
            index = moveByIndex(lists, index);
            cursor = cursor.next;
        }

        return result;
    }

    private int findFirstNotNull(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                return i;
            }
        }
        return -1;
    }

    private int moveByIndex(ListNode[] lists, int index) {
        lists[index] = lists[index].next;

        if (lists[index] == null) {
            // shift
            return index + 1;
        }

        var shift = 0;
        while (index + shift + 1 < lists.length) {
            if (lists[index + shift].val > lists[index + shift + 1].val) {
                var temp = lists[index + shift];
                lists[index + shift] = lists[index + shift + 1];
                lists[index + shift + 1] = temp;
                shift++;
            } else {
                break;
            }
        }

        return index;
    }
}
