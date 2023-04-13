package dev.drf.leetcode.merge.k.sorted.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeKSortedListsProblemTest {
    private final MergeKSortedListsProblem problem = new MergeKSortedListsProblem();

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

        sb.append(listNode.val);
        var cursor = listNode.next;
        while (cursor != null) {
            sb.append("->").append(cursor.val);
            cursor = cursor.next;
        }

        return sb.toString();
    }

    @Test
    void example1() {
        /*
        Input: lists = [[1,4,5],[1,3,4],[2,6]]
        Output: [1,1,2,3,4,4,5,6]
        Explanation: The linked-lists are:
        [
          1->4->5,
          1->3->4,
          2->6
        ]
        merging them into one sorted list:
        1->1->2->3->4->4->5->6
         */
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1,
                new ListNode(4,
                        new ListNode(5)));
        lists[1] = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        lists[2] = new ListNode(2,
                new ListNode(6));

        var result = problem.mergeKLists(lists);

        System.out.println(toLine(result));
        assertListNode(result, 1, 1, 2, 3, 4, 4, 5, 6);
    }

    @Test
    void example2() {
        /*
        Input: lists = []
        Output: []
         */
        ListNode[] lists = new ListNode[0];

        var result = problem.mergeKLists(lists);

        assertNull(result);
    }

    @Test
    void example3() {
        /*
        Input: lists = [[]]
        Output: []
         */
        ListNode[] lists = new ListNode[1];
        lists[0] = new ListNode();

        var result = problem.mergeKLists(lists);

        System.out.println(toLine(result));
        assertListNode(result, 0);
    }

    @Test
    void myTest1() {
        ListNode[] lists = new ListNode[2];
        lists[0] = new ListNode(1,
                new ListNode(1,
                        new ListNode(2)));
        lists[1] = new ListNode(1,
                new ListNode(1,
                        new ListNode(3)));

        var result = problem.mergeKLists(lists);

        System.out.println(toLine(result));
        assertListNode(result, 1, 1, 1, 1, 2, 3);
    }

    @Test
    void myTest2() {
        ListNode[] lists = new ListNode[2];
        lists[0] = new ListNode(5,
                new ListNode(17,
                        new ListNode(99)));
        lists[1] = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));

        var result = problem.mergeKLists(lists);

        System.out.println(toLine(result));
        assertListNode(result, 1, 2, 3, 5, 17, 99);
    }

    @Test
    void runFailed() {
        ListNode[] lists = new ListNode[1];
        lists[0] = null;

        var result = problem.mergeKLists(lists);

        assertNull(result);
    }
}
