package dev.drf.leetcode.remove.duplicates.from.sorted.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedListProblemTest {
    private final RemoveDuplicatesFromSortedListProblem problem = new RemoveDuplicatesFromSortedListProblem();

    @Test
    void example1() {
        /*
        Input: head = [1,1,2]
        Output: [1,2]
         */
        var head = new ListNode(1,
                new ListNode(1,
                        new ListNode(2)));

        var res = problem.deleteDuplicates(head);

        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,1,2,3,3]
        Output: [1,2,3]
         */
        var head = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(3)))));

        var res = problem.deleteDuplicates(head);

        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
        assertEquals(3, res.next.next.val);
    }
}
