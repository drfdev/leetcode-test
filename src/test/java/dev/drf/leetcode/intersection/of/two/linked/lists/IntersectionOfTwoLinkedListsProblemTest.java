package dev.drf.leetcode.intersection.of.two.linked.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntersectionOfTwoLinkedListsProblemTest {
    private final IntersectionOfTwoLinkedListsProblem problem = new IntersectionOfTwoLinkedListsProblem();

    @Test
    void example1() {
        /*
        Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
        Output: Intersected at '8'
         */
        ListNode intersect8 = new ListNode(8);
        ListNode intersect4 = new ListNode(4);
        ListNode intersect5 = new ListNode(5);

        intersect8.next = intersect4;
        intersect4.next = intersect5;

        // listA
        ListNode listA4 = new ListNode(4);
        ListNode listA1 = new ListNode(1);

        listA4.next = listA1;
        listA1.next = intersect8;

        // listB
        ListNode listB5 = new ListNode(5);
        ListNode listB6 = new ListNode(6);
        ListNode listB1 = new ListNode(1);

        listB5.next = listB6;
        listB6.next = listB1;
        listB1.next = intersect8;

        var node = problem.getIntersectionNode(listA4, listB5);

        assertNotNull(node);
        assertSame(intersect8, node);
    }

    @Test
    void example2() {
        /*
        Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
        Output: Intersected at '2'
         */
        // intersect
        ListNode intersect2 = new ListNode(2);
        ListNode intersect4 = new ListNode(4);

        intersect2.next = intersect4;

        // listA
        ListNode listA = new ListNode(1);
        ListNode listA9 = new ListNode(9);
        ListNode listA1 = new ListNode(1);

        listA.next = listA9;
        listA9.next = listA1;
        listA1.next = intersect2;

        // listB
        ListNode listB = new ListNode(3);

        listB.next = intersect2;

        var node = problem.getIntersectionNode(listA, listB);

        assertNotNull(node);
        assertSame(intersect2, node);
    }

    @Test
    void example3() {
        /*
        Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
        Output: No intersection
         */
        // listA
        ListNode listA = new ListNode(2);
        ListNode listA6 = new ListNode(6);
        ListNode listA4 = new ListNode(4);

        listA.next = listA6;
        listA6.next = listA4;

        // listB
        ListNode listB = new ListNode(1);
        ListNode listB5 = new ListNode(5);

        listB.next = listB5;

        var node = problem.getIntersectionNode(listA, listB);

        assertNull(node);
    }
}
