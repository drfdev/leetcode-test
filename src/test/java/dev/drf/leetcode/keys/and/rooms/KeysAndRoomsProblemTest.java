package dev.drf.leetcode.keys.and.rooms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeysAndRoomsProblemTest {
    private final KeysAndRoomsProblem problem = new KeysAndRoomsProblem();

    @Test
    void example1() {
        /*
        Input: rooms = [[1],[2],[3],[]]
        Output: true
         */
        List<List<Integer>> rooms = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        );

        var allOpened = problem.canVisitAllRooms(rooms);

        assertTrue(allOpened);
    }

    @Test
    void example2() {
        /*
        Input: rooms = [[1,3],[3,0,1],[2],[0]]
        Output: false
         */
        List<List<Integer>> rooms = List.of(
                List.of(1, 3),
                List.of(3, 0, 1),
                List.of(2),
                List.of(0)
        );

        var allOpened = problem.canVisitAllRooms(rooms);

        assertFalse(allOpened);
    }
}
