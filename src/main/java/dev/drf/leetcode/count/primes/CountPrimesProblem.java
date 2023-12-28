package dev.drf.leetcode.count.primes;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimesProblem implements Problem {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }

        boolean[] sieveOfEratosthenes = new boolean[n + 1];

        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean iFlag = sieveOfEratosthenes[i];
            if (!iFlag) {
                count++;
                for (int j = i; j < n; j = j + i) {
                    sieveOfEratosthenes[j] = true;
                }
            }
        }

        return count;
    }
}
