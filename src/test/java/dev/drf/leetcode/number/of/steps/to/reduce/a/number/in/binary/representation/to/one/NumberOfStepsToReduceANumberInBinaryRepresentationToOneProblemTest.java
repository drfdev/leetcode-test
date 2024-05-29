package dev.drf.leetcode.number.of.steps.to.reduce.a.number.in.binary.representation.to.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfStepsToReduceANumberInBinaryRepresentationToOneProblemTest {
    private final NumberOfStepsToReduceANumberInBinaryRepresentationToOneProblem1 problem = new NumberOfStepsToReduceANumberInBinaryRepresentationToOneProblem1();

    @Test
    void example1() {
        /*
        Input: s = "1101"
        Output: 6
         */
        var s = "1101";

        var num = problem.numSteps(s);

        assertEquals(6, num);
    }

    @Test
    void example2() {
        /*
        Input: s = "10"
        Output: 1
         */
        var s = "10";

        var num = problem.numSteps(s);

        assertEquals(1, num);
    }

    @Test
    void example3() {
        /*
        Input: s = "1"
        Output: 0
         */
        var s = "1";

        var num = problem.numSteps(s);

        assertEquals(0, num);
    }

    @Test
    void failed1() {
        // "1111011110000011100000110001011011110010111001010111110001"
        var s = "1111011110000011100000110001011011110010111001010111110001";

        var num = problem.numSteps(s);

        assertEquals(85, num);
    }

    @Test
    void failed2() {
        // "1111110011101010110011100100101110010100101110111010111110110010"
        var s = "1111110011101010110011100100101110010100101110111010111110110010";

        var num = problem.numSteps(s);

        assertEquals(89, num);
    }
}
