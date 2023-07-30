package dev.drf.leetcode.insert.delete.getrandom.o1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class InsertDeleteGetRandomO1ProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
        [[], [1], [2], [2], [], [1], [2], []]
        Output
        [null, true, false, true, 2, true, false, 2]
         */
        var set = new InsertDeleteGetRandomO1Problem.RandomizedSet();
        var i1 = set.insert(1);
        var r2 = set.remove(2);
        var i3 = set.insert(2);
        var d4 = set.getRandom();
        var r5 = set.remove(1);
        var i6 = set.insert(2);
        var d7 = set.getRandom();

        assertTrue(i1);
        assertFalse(r2);
        assertTrue(i3);
        assertTrue(d4 == 1 || d4 == 2);
        assertTrue(r5);
        assertFalse(i6);
        assertEquals(2, d7);
    }
}
