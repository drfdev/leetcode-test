package dev.drf.leetcode.palindrome.linked.list;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/palindrome-linked-list
 */
public class PalindromeLinkedListProblem implements Problem {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        Deque<ListNode> stack = new LinkedList<>();
        ListNode cursor = head;

        while (cursor != null) {
            stack.push(cursor);
            cursor = cursor.next;
        }

        cursor = head;
        while (cursor != null) {
            ListNode node = stack.pop();
            if (node.val != cursor.val) {
                return false;
            }
            cursor = cursor.next;
        }

        return true;
    }
}
