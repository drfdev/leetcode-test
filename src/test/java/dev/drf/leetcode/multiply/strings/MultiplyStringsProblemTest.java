package dev.drf.leetcode.multiply.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyStringsProblemTest {
    private final MultiplyStringsProblem problem = new MultiplyStringsProblem();

    @Test
    void example1() {
        /*
        Input: num1 = "2", num2 = "3"
        Output: "6"
         */
        String num1 = "2", num2 = "3";

        var res = problem.multiply(num1, num2);

        assertEquals("6", res);
    }

    @Test
    void example2() {
        /*
        Input: num1 = "123", num2 = "456"
        Output: "56088"
         */
        String num1 = "123", num2 = "456";

        var res = problem.multiply(num1, num2);

        assertEquals("56088", res);
    }

    @Test
    void failed1() {
        // "123456789", "987654321"
        String num1 = "123456789", num2 = "987654321";

        var res = problem.multiply(num1, num2);

        assertEquals("121932631112635269", res);
    }
}
