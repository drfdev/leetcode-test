package dev.drf.leetcode.sort.the.people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortThePeopleProblemTest {
    private final SortThePeopleProblem problem = new SortThePeopleProblem();

    @Test
    void example1() {
        /*
        Input: names = ["Mary","John","Emma"], heights = [180,165,170]
        Output: ["Mary","Emma","John"]
         */
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        var output = problem.sortPeople(names, heights);

        String[] expected = {"Mary", "Emma", "John"};
        assertArrayEquals(expected, output);
    }

    @Test
    void example2() {
        /*
        Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
        Output: ["Bob","Alice","Bob"]
         */
        String[] names = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};

        var output = problem.sortPeople(names, heights);

        String[] expected = {"Bob", "Alice", "Bob"};
        assertArrayEquals(expected, output);
    }
}
