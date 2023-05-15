package dev.drf.leetcode.intersection.of.two.linked.lists;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Solution Used:
 * https://leetcode.com/problems/intersection-of-two-linked-lists/solutions/2116221/visual-explanation-one-pass-java/
 */
public class IntersectionOfTwoLinkedListsProblem implements Problem {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode cursorA = headA;
        ListNode cursorB = headB;

        while (cursorA != cursorB) {
            cursorA = (cursorA == null) ? headB : cursorA.next;
            cursorB = (cursorB == null) ? headA : cursorB.next;
        }

        return cursorA;
    }
}
