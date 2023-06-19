package dev.drf.leetcode.swap.nodes.in.pairs;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesInPairsProblem implements Problem {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode swappedHead = null;
        ListNode swappedCursor = null;
        ListNode cursor = head;

        Deque<ListNode> stack = new LinkedList<>();

        while (cursor != null) {
            stack.push(cursor);
            cursor = cursor.next;

            if (stack.size() == 2) {

                while (!stack.isEmpty()) {
                    ListNode node = stack.poll();
                    if (swappedCursor != null) {
                        swappedCursor.next = node;
                        node.next = null;
                    }
                    if (swappedHead == null) {
                        swappedHead = node;
                    }
                    swappedCursor = node;
                }
            }
        }

        while (!stack.isEmpty()) {
            ListNode node = stack.poll();
            if (swappedCursor != null) {
                swappedCursor.next = node;
                node.next = null;
            }
            if (swappedHead == null) {
                swappedHead = node;
            }
            swappedCursor = node;
        }
        if (swappedCursor != null) {
            swappedCursor.next = null;
        }

        return swappedHead;
    }
}
