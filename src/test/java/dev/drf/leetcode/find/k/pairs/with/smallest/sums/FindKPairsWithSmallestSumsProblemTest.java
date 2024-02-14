package dev.drf.leetcode.find.k.pairs.with.smallest.sums;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class FindKPairsWithSmallestSumsProblemTest {
    private final FindKPairsWithSmallestSumsProblem problem = new FindKPairsWithSmallestSumsProblem();

    @Test
    void example1() {
        /*
        Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
        Output: [[1,2],[1,4],[1,6]]
         */
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;

        var out = problem.kSmallestPairs(nums1, nums2, k);

        assertThat(out, contains(
                contains(1, 2),
                contains(1, 4),
                contains(1, 6)
        ));
    }

    @Test
    void example2() {
        /*
        Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
        Output: [[1,1],[1,1]]
         */
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 2;

        var out = problem.kSmallestPairs(nums1, nums2, k);

        assertThat(out, contains(
                contains(1, 1),
                contains(1, 1)
        ));
    }

    @Test
    void failed1() {
        /*
        [1,2,4,5,6]
        [3,5,7,9]
        3
         */
        int[] nums1 = {1, 2, 4, 5, 6};
        int[] nums2 = {3, 5, 7, 9};
        int k = 3;

        var out = problem.kSmallestPairs(nums1, nums2, k);

        // [[1,3],[2,3],[1,5]]
        assertThat(out, contains(
                contains(1, 3),
                contains(2, 3),
                contains(1, 5)
        ));
    }
}
