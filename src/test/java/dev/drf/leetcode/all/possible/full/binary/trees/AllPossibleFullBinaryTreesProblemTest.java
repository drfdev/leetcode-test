package dev.drf.leetcode.all.possible.full.binary.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllPossibleFullBinaryTreesProblemTest {
    private final AllPossibleFullBinaryTreesProblem problem = new AllPossibleFullBinaryTreesProblem();

    @Test
    void example1() {
        /*
        Input: n = 7
        Output: [
            [0,0,0,null,null,0,0,null,null,0,0],
            [0,0,0,null,null,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,null,null,null,null,0,0],
            [0,0,0,0,0,null,null,0,0]
        ]
         */
        int n = 7;

        var trees = problem.allPossibleFBT(n);

        assertEquals(5, trees.size());
    }

    @Test
    void example2() {
        /*
        Input: n = 3
        Output: [[0,0,0]]
         */
        int n = 3;

        var trees = problem.allPossibleFBT(n);

        assertEquals(1, trees.size());
    }
}
