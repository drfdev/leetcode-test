package dev.drf.leetcode.add.two.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AddTwoNumbersProblemTest {
    private final AddTwoNumbersProblem problem = new AddTwoNumbersProblem();

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

    private String toLine(ListNode listNode) {
        var sb = new StringBuilder();

        sb.append("[");
        sb.append(listNode.val);
        var cursor = listNode.next;
        while (cursor != null) {
            sb.append(", ").append(cursor.val);
            cursor = cursor.next;
        }
        sb.append("]");

        return sb.toString();
    }

    @Test
    void example1() {
        /*
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
         */
        var v1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3)));
        var v2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4)));

        var result = problem.addTwoNumbers(v1, v2);

        System.out.println(toLine(result));
        assertListNode(result, 7, 0, 8);
    }

    @Test
    void example2() {
        /*
        Input: l1 = [0], l2 = [0]
        Output: [0]
         */
        var v1 = new ListNode(0);
        var v2 = new ListNode(0);

        var result = problem.addTwoNumbers(v1, v2);

        System.out.println(toLine(result));
        assertListNode(result, 0);
    }

    @Test
    void example3() {
        /*
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
         */
        var v1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
        var v2 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9))));

        var result = problem.addTwoNumbers(v1, v2);

        System.out.println(toLine(result));
        assertListNode(result, 8, 9, 9, 9, 0, 0, 0, 1);
    }

    @Test
    void myTest1() {
        var v1 = new ListNode(1);
        var v2 = new ListNode(9,
                new ListNode(9));

        var result = problem.addTwoNumbers(v1, v2);

        System.out.println(toLine(result));
        assertListNode(result, 0, 0, 1);
    }
}
