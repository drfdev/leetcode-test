package dev.drf.leetcode.evaluate.reverse.polish.notation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationProblemTest {
    private final EvaluateReversePolishNotationProblem problem = new EvaluateReversePolishNotationProblem();

    @Test
    void example1() {
        /*
        Input: tokens = ["2","1","+","3","*"]
        Output: 9
        Explanation: ((2 + 1) * 3) = 9
         */
        String[] tokens = new String[]{
                "2", "1", "+", "3", "*"
        };

        int result = problem.evalRPN(tokens);

        assertEquals(9, result);
    }

    @Test
    void example2() {
        /*
        Input: tokens = ["4","13","5","/","+"]
        Output: 6
        Explanation: (4 + (13 / 5)) = 6
         */
        String[] tokens = new String[]{
                "4", "13", "5", "/", "+"
        };

        int result = problem.evalRPN(tokens);

        assertEquals(6, result);
    }

    @Test
    void example3() {
        /*
        Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
        Output: 22
        Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
        = ((10 * (6 / (12 * -11))) + 17) + 5
        = ((10 * (6 / -132)) + 17) + 5
        = ((10 * 0) + 17) + 5
        = (0 + 17) + 5
        = 17 + 5
        = 22
         */
        String[] tokens = new String[]{
                "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"
        };

        int result = problem.evalRPN(tokens);

        assertEquals(22, result);
    }
}
