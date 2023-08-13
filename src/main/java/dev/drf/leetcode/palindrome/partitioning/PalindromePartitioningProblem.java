package dev.drf.leetcode.palindrome.partitioning;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-partitioning/
 * Used solution:
 * https://www.youtube.com/watch?v=3jvWodd7ht0
 */
public class PalindromePartitioningProblem implements Problem {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            res.add(new ArrayList<>());
            return res;
        }

        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s, i + 1)) {
                List<List<String>> partitions = partition(s.substring(i + 1));
                for (List<String> list : partitions) {
                    list.add(0, s.substring(0, i + 1));
                    res.add(list);
                }
            }
        }

        return res;
    }

    private boolean isPalindrome(String s, int n) {
        final int len = n / 2;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
