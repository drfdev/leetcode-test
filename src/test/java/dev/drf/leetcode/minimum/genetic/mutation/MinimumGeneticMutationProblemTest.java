package dev.drf.leetcode.minimum.genetic.mutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumGeneticMutationProblemTest {
    private final MinimumGeneticMutationProblem problem = new MinimumGeneticMutationProblem();

    @Test
    void example1() {
        /*
        Input: startGene = "AACCGGTT", endGene = "AACCGGTA", bank = ["AACCGGTA"]
        Output: 1
         */
        String startGene = "AACCGGTT";
        String endGene = "AACCGGTA";
        String[] bank = new String[]{
                "AACCGGTA"
        };

        var out = problem.minMutation(startGene, endGene, bank);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: startGene = "AACCGGTT", endGene = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
        Output: 2
         */
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = new String[]{
                "AACCGGTA", "AACCGCTA", "AAACGGTA"
        };

        var out = problem.minMutation(startGene, endGene, bank);

        assertEquals(2, out);
    }
}
