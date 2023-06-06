package dev.drf.leetcode.partition.labels;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class PartitionLabelsProblemTest {
    private final PartitionLabelsProblem problem = new PartitionLabelsProblem();

    @Test
    void example1() {
        /*
        Input: s = "ababcbacadefegdehijhklij"
        Output: [9,7,8]
         */
        String s = "ababcbacadefegdehijhklij";

        var list = problem.partitionLabels(s);

        assertThat(list, contains(
                9, 7, 8
        ));
    }

    @Test
    void example2() {
        /*
        Input: s = "eccbbbbdec"
        Output: [10]
         */
        String s = "eccbbbbdec";

        var list = problem.partitionLabels(s);

        assertThat(list, contains(
                10
        ));
    }
}
