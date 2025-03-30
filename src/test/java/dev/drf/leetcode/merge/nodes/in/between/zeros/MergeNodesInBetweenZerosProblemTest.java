package dev.drf.leetcode.merge.nodes.in.between.zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MergeNodesInBetweenZerosProblemTest {
    private final MergeNodesInBetweenZerosProblem problem = new MergeNodesInBetweenZerosProblem();

    @Test
    void example1() {
        // Input: head = [0,3,1,0,4,5,2,0]
        // Output: [4,11]
        ListNode head = new ListNode(0,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(0,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(2,
                                                                new ListNode(0))))))));

        var result = problem.mergeNodes(head);

        assertNotNull(result);
        assertEquals(4, result.val);
        assertEquals(11, result.next.val);
    }

    @Test
    void example2() {
        // Input: head = [0,1,0,3,0,2,2,0]
        // Output: [1,3,4]
        ListNode head = new ListNode(0,
                new ListNode(1,
                        new ListNode(0,
                                new ListNode(3,
                                        new ListNode(0,
                                                new ListNode(2,
                                                        new ListNode(2,
                                                                new ListNode(0))))))));

        var result = problem.mergeNodes(head);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(4, result.next.next.val);
    }
}
