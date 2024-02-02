package dev.drf.leetcode.sequential.digits;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/sequential-digits/
 * Used solution:
 * https://leetcode.com/problems/sequential-digits/solutions/4662886/beats-100-users-c-java-python-javascript-2-approaches-explained/
 */
public class SequentialDigitsProblem implements Problem {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int d = 1; d <= 9; d++) {
            int number = d;
            int nextNumber = d + 1;

            while (number <= high && nextNumber <= 9) {
                number = (number * 10) + nextNumber;
                if (low <= number && number <= high) {
                    result.add(number);
                }
                nextNumber++;
            }
        }

        result.sort(null);
        return result;
    }
}
