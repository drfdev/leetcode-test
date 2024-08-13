package dev.drf.leetcode.design.an.ordered.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DesignAnOrderedStreamProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["OrderedStream", "insert", "insert", "insert", "insert", "insert"]
        [[5], [3, "ccccc"], [1, "aaaaa"], [2, "bbbbb"], [5, "eeeee"], [4, "ddddd"]]
        Output
        [null, [], ["aaaaa"], ["bbbbb", "ccccc"], [], ["ddddd", "eeeee"]]
         */
        var stream = new DesignAnOrderedStreamProblem.OrderedStream(5);

        var res1 = stream.insert(3, "ccccc");
        var res2 = stream.insert(1, "aaaaa");
        var res3 = stream.insert(2, "bbbbb");
        var res4 = stream.insert(5, "eeeee");
        var res5 = stream.insert(4, "ddddd");

        // [],
        assertTrue(res1.isEmpty());

        // ["aaaaa"],
        assertEquals(1, res2.size());
        assertTrue(res2.contains("aaaaa"));

        // ["bbbbb", "ccccc"],
        assertEquals(2, res3.size());
        assertTrue(res3.contains("bbbbb"));
        assertTrue(res3.contains("ccccc"));

        // [],
        assertTrue(res4.isEmpty());

        // ["ddddd", "eeeee"]
        assertEquals(2, res5.size());
        assertTrue(res5.contains("ddddd"));
        assertTrue(res5.contains("eeeee"));
    }
}
