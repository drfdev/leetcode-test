package dev.drf.leetcode.reverse.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReverseLinkedListProblemTest {
    private final ReverseLinkedListProblem problem = new ReverseLinkedListProblem();

    private void assertListNode(ListNode listNode, int... values) {
        assertNotNull(listNode);
        var cursor = listNode;
        var index = 0;

        if (values == null || values.length == 0) {
            return;
        }

        while (cursor != null) {
            assertEquals(values[index], cursor.val);

            cursor = cursor.next;
            index++;
        }
    }

    @Test
    void example1() {
        /*
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]
         */
        var head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        var result = problem.reverseList(head);

        assertListNode(result, 5, 4, 3, 2, 1);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2]
        Output: [2,1]
         */
        var head = new ListNode(1,
                new ListNode(2));

        var result = problem.reverseList(head);

        assertListNode(result, 2, 1);
    }

    @Test
    void example3() {
        /*
        Input: head = []
        Output: []
         */
        var head = new ListNode();

        var result = problem.reverseList(head);

        assertListNode(result, 0);
    }

    @Test
    void myTest1() {
        var head = new ListNode(5);

        var result = problem.reverseList(head);

        assertListNode(result, 5);
    }
}
