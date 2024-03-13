package dev.drf.leetcode.remove.zero.sum.consecutive.nodes.from.linked.list;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
 * Used solution:
 * https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/solutions/4862118/speed-is-the-key-explained-efficient/
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedListProblem implements Problem {
    public ListNode removeZeroSumSublists(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.next == null) {
//            return head;
//        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int prefixSum = 0;
        Map<Integer, ListNode> prefixSumToNode = new HashMap<>();

        for (ListNode current = dummy; current != null; current = current.next) {
            prefixSum += current.val;
            if (prefixSumToNode.containsKey(prefixSum)) {
                ListNode prev = prefixSumToNode.get(prefixSum);
                ListNode toRemove = prev.next;
                int p = prefixSum + (toRemove != null ? toRemove.val : 0);

                while (p != prefixSum) {
                    prefixSumToNode.remove(p);
                    toRemove = toRemove.next;
                    p += (toRemove != null ? toRemove.val : 0);
                }

                prev.next = current.next;
            } else {
                prefixSumToNode.put(prefixSum, current);
            }
        }

        return dummy.next;
    }
}
