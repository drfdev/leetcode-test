package dev.drf.leetcode.count.of.matches.in.tournament;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOfMatchesInTournamentProblemTest {
    private final CountOfMatchesInTournamentProblem problem = new CountOfMatchesInTournamentProblem();

    @Test
    void example1() {
        // Input: n = 7
        // Output: 6
        int n = 7;

        var out = problem.numberOfMatches(n);

        assertEquals(6, out);
    }

    @Test
    void example2() {
        // Input: n = 14
        // Output: 13
        int n = 14;

        var out = problem.numberOfMatches(n);

        assertEquals(13, out);
    }
}
