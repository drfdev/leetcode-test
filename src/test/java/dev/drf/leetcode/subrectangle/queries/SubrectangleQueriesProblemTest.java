package dev.drf.leetcode.subrectangle.queries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubrectangleQueriesProblemTest {
    private final SubrectangleQueriesProblem problem = new SubrectangleQueriesProblem();

    @Test
    void example1() {
        // Input
        // ["SubrectangleQueries","getValue","updateSubrectangle","getValue","getValue","updateSubrectangle","getValue","getValue"]
        // [[[[1,2,1],[4,3,4],[3,2,1],[1,1,1]]],[0,2],[0,0,3,2,5],[0,2],[3,1],[3,0,3,2,10],[3,1],[0,2]]
        // Output
        // [null,1,null,5,5,null,10,5]
        var subrectangleQueries = new SubrectangleQueriesProblem.SubrectangleQueries(new int[][]
                {
                        {1, 2, 1},
                        {4, 3, 4},
                        {3, 2, 1},
                        {1, 1, 1}
                });
        var r1 = subrectangleQueries.getValue(0, 2); // return 1
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        var r2 = subrectangleQueries.getValue(0, 2); // return 5
        var r3 = subrectangleQueries.getValue(3, 1); // return 5
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        var r4 = subrectangleQueries.getValue(3, 1); // return 10
        var r5 = subrectangleQueries.getValue(0, 2); // return 5

        assertEquals(1, r1);
        assertEquals(5, r2);
        assertEquals(5, r3);
        assertEquals(10, r4);
        assertEquals(5, r5);
    }

    @Test
    void example2() {
        // Input
        // ["SubrectangleQueries","getValue","updateSubrectangle","getValue","getValue","updateSubrectangle","getValue"]
        // [[[[1,1,1],[2,2,2],[3,3,3]]],[0,0],[0,0,2,2,100],[0,0],[2,2],[1,1,2,2,20],[2,2]]
        // Output
        // [null,1,null,100,100,null,20]
        var subrectangleQueries = new SubrectangleQueriesProblem.SubrectangleQueries(new int[][]
                {
                        {1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3}
                });
        var r1 = subrectangleQueries.getValue(0, 0); // return 1
        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
        var r2 = subrectangleQueries.getValue(0, 0); // return 100
        var r3 = subrectangleQueries.getValue(2, 2); // return 100
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
        var r4 = subrectangleQueries.getValue(2, 2); // return 20

        assertEquals(1, r1);
        assertEquals(100, r2);
        assertEquals(100, r3);
        assertEquals(20, r4);
    }
}
