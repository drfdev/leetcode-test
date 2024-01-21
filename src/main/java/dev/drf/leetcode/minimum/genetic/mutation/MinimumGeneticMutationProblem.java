package dev.drf.leetcode.minimum.genetic.mutation;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-genetic-mutation/
 * Used solution:
 * https://leetcode.com/problems/minimum-genetic-mutation/solutions/2768872/leetcode-the-hard-way-explained-line-by-line/
 */
public class MinimumGeneticMutationProblem implements Problem {
    public int minMutation(String startGene, String endGene, String[] bank) {
        final String ACGT = "ACGT";

        Queue<String> stack = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        List<String> banks = Arrays.asList(bank);

        int steps = 0;

        stack.add(startGene);
        visited.add(startGene);

        while (!stack.isEmpty()) {
            for (int i = stack.size(); i > 0; i--) {
                String s = stack.poll();
                if (s.equals(endGene)) {
                    return steps;
                }
                char[] ca = s.toCharArray();
                for (int j = 0; j < 8; j++) {
                    char oc = ca[j];

                    for (int k = 0; k < 4; k++) {
                        ca[j] = ACGT.charAt(k);
                        String t = new String(ca);

                        if (!visited.contains(t)
                                && banks.contains(t)) {
                            stack.add(t);
                            visited.add(t);
                        }
                    }
                    ca[j] = oc;
                }
            }
            steps++;
        }
        return -1;
    }
}
