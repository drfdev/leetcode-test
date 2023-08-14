package dev.drf.leetcode.linked.list.cycle.ii;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleIIProblem implements Problem {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode cursor = head;
        Set<ListNode> nodes = new HashSet<>();
        while (cursor != null) {
            if (nodes.contains(cursor)) {
                return cursor;
            }
            nodes.add(cursor);
            cursor = cursor.next;
        }

        return null;
    }
}
