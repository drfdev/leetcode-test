package dev.drf.leetcode.basic.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorProblemTest {
    private final BasicCalculatorProblem problem = new BasicCalculatorProblem();

    @Test
    void example1() {
        /*
        Input: s = "1 + 1"
        Output: 2
         */
        var s = "1 + 1";

        var result = problem.calculate(s);

        assertEquals(2, result);
    }

    @Test
    void example2() {
        /*
        Input: s = " 2-1 + 2 "
        Output: 3
         */
        var s = " 2-1 + 2 ";

        var result = problem.calculate(s);

        assertEquals(3, result);
    }

    @Test
    void example3() {
        /*
        Input: s = "(1+(4+5+2)-3)+(6+8)"
        Output: 23
         */
        var s = "(1+(4+5+2)-3)+(6+8)";

        var result = problem.calculate(s);

        assertEquals(23, result);
    }

    @Test
    void myTest1() {
        // "(21+34+120-99)"
        // 76
        var s = "(21+34+120-99)";

        var result = problem.calculate(s);

        assertEquals(76, result);
    }

    @Test
    void myTest2() {
        // "12 + -2"
        // 10
        var s = "12 + -2";

        var result = problem.calculate(s);

        assertEquals(10, result);
    }
}
