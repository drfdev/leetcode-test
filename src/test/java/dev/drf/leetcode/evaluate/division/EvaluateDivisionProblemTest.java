package dev.drf.leetcode.evaluate.division;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateDivisionProblemTest {
    private final EvaluateDivisionProblem problem = new EvaluateDivisionProblem();

    private void assertArray(double[] arr, double... values) {
        assertEquals(values.length, arr.length);

        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], arr[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: equations = [["a","b"],["b","c"]],
            values = [2.0,3.0],
            queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
        Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000]
         */

        List<List<String>> equations = List.of(
                List.of("a", "b"),
                List.of("b", "c")
        );
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("b", "a"),
                List.of("a", "e"),
                List.of("a", "a"),
                List.of("x", "x")
        );

        var arr = problem.calcEquation(equations, values, queries);

        assertArray(arr, 6.00000, 0.50000, -1.00000, 1.00000, -1.00000);
    }

    @Test
    void example2() {
        /*
        Input: equations = [["a","b"],["b","c"],["bc","cd"]],
            values = [1.5,2.5,5.0],
            queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
        Output: [3.75000,0.40000,5.00000,0.20000]
         */
        List<List<String>> equations = List.of(
                List.of("a", "b"),
                List.of("b", "c"),
                List.of("bc", "cd")
        );
        double[] values = new double[]{
                1.5, 2.5, 5.0
        };
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("c", "b"),
                List.of("bc", "cd"),
                List.of("cd", "bc")
        );

        var arr = problem.calcEquation(equations, values, queries);

        assertArray(arr, 3.75000, 0.40000, 5.00000, 0.20000);
    }

    @Test
    void example3() {
        /*
        Input: equations = [["a","b"]],
            values = [0.5],
            queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
        Output: [0.50000,2.00000,-1.00000,-1.00000]
         */
        List<List<String>> equations = List.of(
                List.of("a", "b")
        );
        double[] values = new double[]{
                0.5
        };
        List<List<String>> queries = List.of(
                List.of("a", "b"),
                List.of("b", "a"),
                List.of("a", "c"),
                List.of("x", "y")
        );

        var arr = problem.calcEquation(equations, values, queries);

        assertArray(arr, 0.50000, 2.00000, -1.00000, -1.00000);
    }
}
