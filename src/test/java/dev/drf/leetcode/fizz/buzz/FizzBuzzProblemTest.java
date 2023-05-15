package dev.drf.leetcode.fizz.buzz;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class FizzBuzzProblemTest {
    private final FizzBuzzProblem problem = new FizzBuzzProblem();

    @Test
    void example1() {
        /*
        Input: n = 3
        Output: ["1","2","Fizz"]
         */
        int n = 3;

        var result = problem.fizzBuzz(n);

        assertThat(result, contains(
                "1", "2", "Fizz"
        ));
    }

    @Test
    void example2() {
        /*
        Input: n = 5
        Output: ["1","2","Fizz","4","Buzz"]
         */
        int n = 5;

        var result = problem.fizzBuzz(n);

        assertThat(result, contains(
                "1", "2", "Fizz", "4", "Buzz"
        ));
    }

    @Test
    void example3() {
        /*
        Input: n = 15
        Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
         */
        int n = 15;

        var result = problem.fizzBuzz(n);

        assertThat(result, contains(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
        ));
    }
}
