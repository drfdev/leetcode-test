package dev.drf.leetcode.convert.binary.number.in.a.linked.list.to.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBinaryNumberInALinkedListToIntegerProblemTest {
    private final ConvertBinaryNumberInALinkedListToIntegerProblem problem = new ConvertBinaryNumberInALinkedListToIntegerProblem();

    @Test
    void example1() {
        /*
        Input: head = [1,0,1]
        Output: 5
         */
        ListNode head = new ListNode(1,
                new ListNode(0,
                        new ListNode(1)));

        var out = problem.getDecimalValue(head);

        assertEquals(5, out);
    }

    @Test
    void example2() {
        /*
        Input: head = [0]
        Output: 0
         */
        ListNode head = new ListNode(0);

        var out = problem.getDecimalValue(head);

        assertEquals(0, out);
    }

    @Test
    void myTest() {
        // 1101
        // 13
        ListNode head = new ListNode(1,
                new ListNode(1,
                        new ListNode(0,
                                new ListNode(1))));

        var out = problem.getDecimalValue(head);

        assertEquals(13, out);
    }
}
