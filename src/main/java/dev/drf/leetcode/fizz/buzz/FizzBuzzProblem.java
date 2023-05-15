package dev.drf.leetcode.fizz.buzz;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzzProblem implements Problem {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);

        final int size = (n + 1);
        for (int i = 1; i < size; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // FizzBuzz
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                // Fizz
                result.add("Fizz");
            } else if (i % 5 == 0) {
                // Buzz
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return  result;
    }
}
