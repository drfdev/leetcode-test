package dev.drf.leetcode.merge.two.sorted.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListsProblemTest {
    private final MergeTwoSortedListsProblem problem = new MergeTwoSortedListsProblem();

    private static void assertListNode(ListNode res, int... vals) {
        ListNode cursor = res;
        for (int val : vals) {
            assertNotNull(cursor);
            assertEquals(val, cursor.val);

            cursor = cursor.next;
        }
    }

    @Test
    void example1() {
        /*
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
         */
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        var res = problem.mergeTwoLists(list1, list2);

        assertListNode(res, 1, 1, 2, 3, 4, 4);
    }

    @Test
    void example2() {
        /*
        Input: list1 = [], list2 = []
        Output: []
         */
        ListNode list1 = null;
        ListNode list2 = null;

        var res = problem.mergeTwoLists(list1, list2);

        assertNull(res);
    }

    @Test
    void example3() {
        /*
        Input: list1 = [], list2 = [0]
        Output: [0]
         */
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        var res = problem.mergeTwoLists(list1, list2);

        assertListNode(res, 0);
    }
}