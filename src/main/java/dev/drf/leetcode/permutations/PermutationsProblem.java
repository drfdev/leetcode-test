package dev.drf.leetcode.permutations;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 * Used solution:
 * https://www.youtube.com/watch?v=s7AvT7cGdSo
 */
public class PermutationsProblem implements Problem {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(ans, nums, 0);
        return ans;
    }

    private void permutation(List<List<Integer>> ans, int[] arr, int start) {
        if (start == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int val : arr) {
                list.add(val);
            }
            ans.add(list);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permutation(ans, arr, start + 1);
            swap(arr, start, i);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
