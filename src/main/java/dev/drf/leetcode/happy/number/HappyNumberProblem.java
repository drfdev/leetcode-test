package dev.drf.leetcode.happy.number;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumberProblem implements Problem {
    public boolean isHappy(int n) {
        Set<Integer> loopDetector = new HashSet<>();

        int value = n;
        while (true) {
            value = calculate(value);
            if (loopDetector.contains(value)) {
                return false;
            }
            if (value == 1) {
                return true;
            }
            loopDetector.add(value);
        }

//        return false;
    }

    private int calculate(int value) {
        int sum = 0;
        int val = value;

        while (val >= 10) {
            int element = val % 10;
            sum += element * element;

            val = val / 10;
        }
        if (val > 0) {
            sum += val * val;
        }

        return sum;
    }
}
