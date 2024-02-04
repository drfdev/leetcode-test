package dev.drf.leetcode.middle.of.the.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class MiddleOfTheLinkedListProblemTest {
    private final MiddleOfTheLinkedListProblem problem = new MiddleOfTheLinkedListProblem();

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4,5]
        Output: [3,4,5]
         */
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        var node = problem.middleNode(node1);

        assertSame(node3, node);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2,3,4,5,6]
        Output: [4,5,6]
         */
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        var node = problem.middleNode(node1);

        assertSame(node4, node);
    }
}
