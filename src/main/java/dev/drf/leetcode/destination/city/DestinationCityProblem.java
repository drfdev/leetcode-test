package dev.drf.leetcode.destination.city;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/destination-city/
 * Used solution:
 * https://leetcode.com/problems/destination-city/solutions/856289/java-100-0-faster-set-solution/
 */
public class DestinationCityProblem implements Problem {
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();

        for (List<String> path : paths) {
            cities.add(path.get(0));
        }

        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!cities.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
}
