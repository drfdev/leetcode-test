package dev.drf.leetcode.remove.duplicates.from.sorted.list.ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedListIIProblemTest {
    private final RemoveDuplicatesFromSortedListIIProblem problem = new RemoveDuplicatesFromSortedListIIProblem();

    private static void assertListNode(ListNode result, int... values) {
        var cursor = result;
        int index = 0;
        while (cursor != null) {
            assertEquals(values[index], cursor.val);
            index++;
            cursor = cursor.next;
        }
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,3,4,4,5]
        Output: [1,2,5]
         */
        var head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(4,
                                                        new ListNode(5)))))));

        var result = problem.deleteDuplicates(head);

        assertListNode(result, 1, 2, 5);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,1,1,2,3]
        Output: [2,3]
         */
        var head = new ListNode(1,
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3)))));

        var result = problem.deleteDuplicates(head);

        assertListNode(result, 2, 3);
    }
}
