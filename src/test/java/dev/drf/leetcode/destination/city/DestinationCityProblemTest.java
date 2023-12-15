package dev.drf.leetcode.destination.city;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DestinationCityProblemTest {
    private final DestinationCityProblem problem = new DestinationCityProblem();

    @Test
    void example1() {
        /*
        Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
        Output: "Sao Paulo"
         */
        var paths = new ArrayList<List<String>>();
        paths.add(List.of("London", "New York"));
        paths.add(List.of("New York", "Lima"));
        paths.add(List.of("Lima", "Sao Paulo"));

        var dest = problem.destCity(paths);

        assertEquals("Sao Paulo", dest);
    }

    @Test
    void example2() {
        /*
        Input: paths = [["B","C"],["D","B"],["C","A"]]
        Output: "A"
         */
        var paths = new ArrayList<List<String>>();
        paths.add(List.of("B", "C"));
        paths.add(List.of("D", "B"));
        paths.add(List.of("C", "A"));

        var dest = problem.destCity(paths);

        assertEquals("A", dest);
    }

    @Test
    void example3() {
        /*
        Input: paths = [["A","Z"]]
        Output: "Z"
         */
        var paths = new ArrayList<List<String>>();
        paths.add(List.of("A","Z"));

        var dest = problem.destCity(paths);

        assertEquals("Z", dest);
    }
}
