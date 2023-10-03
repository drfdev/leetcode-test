package dev.drf.leetcode.palindrome.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListProblemTest {
    private final PalindromeLinkedListProblem problem = new PalindromeLinkedListProblem();

    @Test
    void example1() {
        /*
        Input: head = [1,2,2,1]
        Output: true
         */
        var head = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1))));

        var res = problem.isPalindrome(head);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: head = [1,2]
        Output: false
         */
        var head = new ListNode(1,
                new ListNode(2));

        var res = problem.isPalindrome(head);

        assertFalse(res);
    }

    @Test
    void myTest1() {
        var head = new ListNode(1,
                new ListNode(2,
                        new ListNode(1)));

        var res = problem.isPalindrome(head);

        assertTrue(res);
    }
}
