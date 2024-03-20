package dev.drf.leetcode.merge.in.between.linked.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeInBetweenLinkedListsProblemTest {
    private final MergeInBetweenLinkedListsProblem problem = new MergeInBetweenLinkedListsProblem();

    private static void assertListNode(ListNode list, int... values) {
        var cursor = list;
        int index = 0;
        while (cursor != null) {
            assertEquals(values[index], cursor.val);
            cursor = cursor.next;
            index++;
        }
        assertEquals(index, values.length);
    }

    @Test
    void example1() {
        /*
        Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
        Output: [10,1,13,1000000,1000001,1000002,5]
         */
        ListNode list1 = new ListNode(10,
                new ListNode(1,
                        new ListNode(13,
                                new ListNode(6,
                                        new ListNode(9,
                                                new ListNode(5))))));
        int a = 3, b = 4;
        ListNode list2 = new ListNode(1000000,
                new ListNode(1000001,
                        new ListNode(1000002)));

        var res = problem.mergeInBetween(list1, a, b, list2);

        assertListNode(res, 10, 1, 13, 1000000, 1000001, 1000002, 5);
    }

    @Test
    void example2() {
        /*
        Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
        Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
         */
        ListNode list1 = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6)))))));
        int a = 2, b = 5;
        ListNode list2 = new ListNode(1000000,
                new ListNode(1000001,
                        new ListNode(1000002,
                                new ListNode(1000003,
                                        new ListNode(1000004)))));

        var res = problem.mergeInBetween(list1, a, b, list2);

        assertListNode(res, 0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6);
    }
}
