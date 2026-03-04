package dev.drf.leetcode.total.waviness.of.numbers.in.range.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii/
 * Used solution:
 * https://www.youtube.com/watch?v=ZWAnOHZv7AU
 * Time Limit Exceeded
 */
@Deprecated
public class TotalWavinessOfNumbersInRangeIIProblem implements Problem {
    private Long[][][][][][] dp = null;

    public long totalWaviness(long num1, long num2) {
        return count(num2) - count(num1 - 1);
    }

    private long count(long x) {
        if (x == 0) {
            return 0;
        }

        final char[] value = Long.toString(x).toCharArray();
        fillDp();

        return solve(0, 0, 10, 10, 0, 0, value);
    }

    private void fillDp() {
        dp = new Long[16][16][11][11][2][2];
    }

    private long solve(int pos, // position
                       int sum, // count all waviness (so far)
                       int prv2, // previous of previous of position [prv2, prv, pos]
                       int prv, // previous of position [prv2, prv, pos]
                       int small, // smaller < x || boolean small
                       int nz, // non-zero digit so far || boolean nz
                       final char[] value) {
        if (pos >= value.length) {
            return sum;
        }
        if (dp[pos][sum][prv2][prv][small][nz] != null) {
            return dp[pos][sum][prv2][prv][small][nz];
        }
        final int val = value[pos] - '0';
        int lim = (small != 0) ? 9 : val;
        long ans = 0;
        for (int i = 0; i <= lim; i++) {
            boolean nsmall = (small != 0) || (i < val);
            boolean nnz = (nz != 0) || (i != 0);
            if (nnz) {
                int nprv2 = prv;
                int nprv = i;
                int nsum = sum;
                if (prv2 != 10 && prv != 10) {
                    nsum += (prv2 < prv && prv > i) ? 1 : 0;
                    nsum += (prv2 > prv && prv < i) ? 1 : 0;
                }
                ans += solve(pos + 1, nsum, nprv2, nprv, nsmall ? 1 : 0, nnz ? 1 : 0, value);
            } else {
                ans += solve(pos + 1, sum, prv2, prv, nsmall ? 1 : 0, nnz ? 1 : 0, value);
            }
        }
        dp[pos][sum][prv2][prv][small][nz] = ans;
        return ans;
    }
}
