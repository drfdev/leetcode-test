package dev.drf.leetcode.delete.the.middle.node.of.a.linked.list;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 */
public class DeleteTheMiddleNodeOfALinkedListProblem implements Problem {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode lengthCursor = head;
        ListNode nodeCursor = head;
        ListNode prCursor = null;

        int length = 0;
        int nodeCount = 0;

        int expectedNode = -1;

        while (nodeCursor != null) {
            if (lengthCursor != null) {
                length++;
                lengthCursor = lengthCursor.next;
                if (lengthCursor != null) {
                    length++;
                    lengthCursor = lengthCursor.next;
                    if (lengthCursor != null) {
                        length++;
                        lengthCursor = lengthCursor.next;
                    }
                }
            }

            nodeCount++;
            prCursor = nodeCursor;
            nodeCursor = nodeCursor.next;

            if (lengthCursor == null) {
                if (expectedNode == -1) {
                    expectedNode = length / 2;
                }

                if (nodeCount == expectedNode) {
                    break;
                }
            }
        }

        if (prCursor == null || length == 1) {
            return null;
        }

        prCursor.next = nodeCursor.next;
        return head;
    }
}
