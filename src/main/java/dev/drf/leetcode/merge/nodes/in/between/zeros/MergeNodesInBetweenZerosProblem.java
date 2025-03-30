package dev.drf.leetcode.merge.nodes.in.between.zeros;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/merge-nodes-in-between-zeros/
 */
public class MergeNodesInBetweenZerosProblem implements Problem {
    public ListNode mergeNodes(ListNode head) {
        if (head.next == null || head.next.val == 0) {
            return new ListNode();
        }

        var result = new ListNode();
        var next = head.next;
        var node = result;
        boolean buildNext = false;
        while (next != null) {
            if (next.val == 0) {
                buildNext = true;
            } else {
                if (buildNext) {
                    node.next = new ListNode(0);
                    node = node.next;
                    buildNext = false;
                }
                node.val += next.val;
            }

            next = next.next;
        }

        return result;
    }
}
