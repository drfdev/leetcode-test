package dev.drf.leetcode.maximum.twin.sum.of.a.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTwinSumOfALinkedListProblemTest {
    private final MaximumTwinSumOfALinkedListProblem problem = new MaximumTwinSumOfALinkedListProblem();

    @Test
    void example1() {
        /*
        Input: head = [5,4,2,1]
        Output: 6
         */
        ListNode head = new ListNode(5,
                new ListNode(4,
                        new ListNode(2,
                                new ListNode(1))));

        var res = problem.pairSum(head);

        assertEquals(6, res);
    }

    @Test
    void example2() {
        /*
        Input: head = [4,2,2,3]
        Output: 7
         */
        ListNode head = new ListNode(4,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(3))));

        var res = problem.pairSum(head);

        assertEquals(7, res);
    }

    @Test
    void example3() {
        /*
        Input: head = [1,100000]
        Output: 100001
         */
        ListNode head = new ListNode(1,
                new ListNode(100000));

        var res = problem.pairSum(head);

        assertEquals(100001, res);
    }
}
