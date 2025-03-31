package dev.drf.leetcode.insert.greatest.common.divisors.in.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertGreatestCommonDivisorsInLinkedListProblemTest {
    private final InsertGreatestCommonDivisorsInLinkedListProblem problem = new InsertGreatestCommonDivisorsInLinkedListProblem();

    @Test
    void example1() {
        // Input: head = [18,6,10,3]
        // Output: [18,6,6,2,10,1,3]
        ListNode head = new ListNode(18,
                new ListNode(6,
                        new ListNode(10,
                                new ListNode(3))));

        var out = problem.insertGreatestCommonDivisors(head);

        assertEquals(18, out.val);
        assertEquals(6, out.next.val);
        assertEquals(6, out.next.next.val);
        assertEquals(2, out.next.next.next.val);
        assertEquals(10, out.next.next.next.next.val);
        assertEquals(1, out.next.next.next.next.next.val);
        assertEquals(3, out.next.next.next.next.next.next.val);
    }

    @Test
    void example2() {
        // Input: head = [7]
        // Output: [7]
        ListNode head = new ListNode(7);

        var out = problem.insertGreatestCommonDivisors(head);

        assertEquals(7, out.val);
    }
}
