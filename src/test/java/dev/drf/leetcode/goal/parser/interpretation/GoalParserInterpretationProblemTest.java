package dev.drf.leetcode.goal.parser.interpretation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalParserInterpretationProblemTest {
    private final GoalParserInterpretationProblem problem = new GoalParserInterpretationProblem();

    @Test
    void example1() {
        // Input: command = "G()(al)"
        // Output: "Goal"
        var command = "G()(al)";

        var res = problem.interpret(command);

        assertEquals("Goal", res);
    }

    @Test
    void example2() {
        // Input: command = "G()()()()(al)"
        // Output: "Gooooal"
        var command = "G()()()()(al)";

        var res = problem.interpret(command);

        assertEquals("Gooooal", res);
    }

    @Test
    void example3() {
        // Input: command = "(al)G(al)()()G"
        // Output: "alGalooG"
        var command = "(al)G(al)()()G";

        var res = problem.interpret(command);

        assertEquals("alGalooG", res);
    }
}
