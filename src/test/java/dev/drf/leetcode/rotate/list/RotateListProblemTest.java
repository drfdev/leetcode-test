package dev.drf.leetcode.rotate.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateListProblemTest {
    private final RotateListProblem problem = new RotateListProblem();

    private static void assertListNode(ListNode res, int... values) {
        var cursor = res;
        int index = 0;
        while (cursor != null) {
            int val = cursor.val;
            assertEquals(values[index], val);

            cursor = cursor.next;
            index++;
        }

        assertEquals(index, values.length);
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4,5], k = 2
        Output: [4,5,1,2,3]
         */
        var head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        int k = 2;

        var res = problem.rotateRight(head, k);

        assertListNode(res, 4, 5, 1, 2, 3);
    }

    @Test
    void example2() {
        /*
        Input: head = [0,1,2], k = 4
        Output: [2,0,1]
         */
        var head = new ListNode(0,
                new ListNode(1,
                        new ListNode(2)));
        int k = 4;

        var res = problem.rotateRight(head, k);

        assertListNode(res, 2, 0, 1);
    }

    @Test
    void failed1() {
        // head = [1,2]
        // k = 2
        var head = new ListNode(1,
                new ListNode(2));
        int k = 2;

        var res = problem.rotateRight(head, k);

        assertListNode(res, 1, 2);
    }
}
