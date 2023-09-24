package dev.drf.leetcode.reconstruct.itinerary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class ReconstructItineraryProblemTest {
    private final ReconstructItineraryProblem problem = new ReconstructItineraryProblem();

    @Test
    void example1() {
        /*
        Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
        Output: ["JFK","MUC","LHR","SFO","SJC"]
         */
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(List.of("MUC", "LHR"));
        tickets.add(List.of("JFK", "MUC"));
        tickets.add(List.of("SFO", "SJC"));
        tickets.add(List.of("LHR", "SFO"));

        var result = problem.findItinerary(tickets);

        assertThat(result, contains(
                "JFK", "MUC", "LHR", "SFO", "SJC"
        ));
    }

    @Test
    void example2() {
        /*
        Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
        Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
         */
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(List.of("JFK", "SFO"));
        tickets.add(List.of("JFK", "ATL"));
        tickets.add(List.of("SFO", "ATL"));
        tickets.add(List.of("ATL", "JFK"));
        tickets.add(List.of("ATL", "SFO"));

        var result = problem.findItinerary(tickets);

        assertThat(result, contains(
                "JFK", "ATL", "JFK", "SFO", "ATL", "SFO"
        ));
    }

    @Test
    void myExample1() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(List.of("JFK", "B"));
        tickets.add(List.of("JFK", "C"));
        tickets.add(List.of("C", "JFK"));

        var result = problem.findItinerary(tickets);

        assertThat(result, contains(
                "JFK", "C", "JFK", "B"
        ));
    }
}
