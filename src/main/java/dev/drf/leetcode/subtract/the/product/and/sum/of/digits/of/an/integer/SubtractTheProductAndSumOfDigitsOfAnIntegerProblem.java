package dev.drf.leetcode.subtract.the.product.and.sum.of.digits.of.an.integer;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractTheProductAndSumOfDigitsOfAnIntegerProblem implements Problem {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int number = n % 10;
            product *= number;
            sum += number;
            n = n / 10;
        }

        return (product - sum);
    }
}
