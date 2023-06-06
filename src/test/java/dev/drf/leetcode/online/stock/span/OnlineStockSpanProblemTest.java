package dev.drf.leetcode.online.stock.span;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlineStockSpanProblemTest {
//    private final OnlineStockSpanProblem problem = new OnlineStockSpanProblem();

    private void runProblem(int[] inputs, int[] outputs) {
        var spanner = new OnlineStockSpanProblem.StockSpanner();

        for (int i = 0; i < inputs.length; i++) {
            int input = inputs[i];
            int output = outputs[i];

            var result = spanner.next(input);
            assertEquals(output, result, "Iteration: " + i);
        }
    }

    @Test
    void example1() {
        /*
        Input
        ["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
        [[], [100], [80], [60], [70], [60], [75], [85]]
        Output
        [null, 1, 1, 1, 2, 1, 4, 6]
         */
        int[] inputs = new int[]{
                100, 80, 60, 70, 60, 75, 85
        };
        int[] outputs = new int[]{
                1, 1, 1, 2, 1, 4, 6
        };

        runProblem(inputs, outputs);
    }

    @Test
    void failed1() {
        /*
        [[],[31],[41],[48],[59],[79]]
        [null,1,2,3,4,5]
         */
        int[] inputs = new int[]{
                31, 41, 48, 59, 79
        };
        int[] outputs = new int[]{
                1, 2, 3, 4, 5
        };

        runProblem(inputs, outputs);
    }
}
