package dev.drf.leetcode.remove.nth.node.from.end.of.list;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfListProblem implements Problem {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Deque<ListNode> stack = new LinkedList<>();

        ListNode cursor = head;
        while (cursor != null) {
            stack.add(cursor);
            cursor = cursor.next;
        }

        int index = 0;
        ListNode previous = null;
        ListNode result = head;

        while (index != n) {
            ListNode current = stack.removeLast();
            index++;
            if (index == n) {
                if (stack.isEmpty()) {
                    result = previous;
                } else {
                    ListNode next = stack.removeLast();
                    if (next == null) {
                        result = current;
                    } else {
                        next.next = previous;
                    }
                }
                break;
            }
            previous = current;
        }

        return result;
    }


}
