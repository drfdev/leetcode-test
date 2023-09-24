package dev.drf.leetcode.reconstruct.itinerary;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/reconstruct-itinerary/
 */
public class ReconstructItineraryProblem implements Problem {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> itinerary = new LinkedList<>();
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        Stack<String> stack = new Stack<>();

        for (List<String> ticket : tickets) {
            graph.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>())
                    .add(ticket.get(1));
        }

        stack.push("JFK");
        PriorityQueue<String> defVal = new PriorityQueue<>();
        while (!stack.isEmpty()) {
            String nextDestination = stack.peek();

            PriorityQueue<String> g = graph.getOrDefault(nextDestination, defVal);
            if (!g.isEmpty()) {
                stack.push(graph.get(nextDestination).poll());
            } else {
                itinerary.addFirst(stack.pop());
            }
        }
        return itinerary;
    }
}
