package dev.drf.leetcode.reverse.nodes.in.k.group;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
public class ReverseNodesInKGroupProblem implements Problem {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (k == 1) {
            return head;
        }

        ListNode cursor = head;
        Deque<ListNode> stack = new LinkedList<>();
        ListNode newHead = null;
        ListNode previous = null;

        while (cursor != null) {
            stack.push(cursor);

            cursor = cursor.next;

            if (stack.size() == k) {
                ListNode stackCursor = stack.pop();
                if (newHead == null) {
                    newHead = stackCursor;
                }
                if (previous != null) {
                    previous.next = stackCursor;
                }
                while (!stack.isEmpty()) {
                    ListNode popped = stack.pop();
                    stackCursor.next = popped;
                    stackCursor = popped;
                }

                stackCursor.next = cursor;
                previous = stackCursor;
            }
        }

        if (newHead == null) {
            newHead = head;
        }

        return newHead;
    }
}
