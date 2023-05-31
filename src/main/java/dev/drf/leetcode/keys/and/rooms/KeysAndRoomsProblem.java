package dev.drf.leetcode.keys.and.rooms;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/keys-and-rooms/
 */
public class KeysAndRoomsProblem implements Problem {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int roomCount = rooms.size();

        Set<Integer> unlockedRooms = new HashSet<>(roomCount);
        unlockedRooms.add(0);

        List<Integer> keys = rooms.get(0);
        tryToUnlock(keys, unlockedRooms, rooms);

        int unlockedCount = unlockedRooms.size();
        return roomCount == unlockedCount;
    }

    private void tryToUnlock(List<Integer> keys, Set<Integer> unlockedRooms, List<List<Integer>> rooms) {
        if (keys == null || keys.isEmpty()) {
            return;
        }

        for (Integer key : keys) {
            if (!unlockedRooms.contains(key)) {
                unlockedRooms.add(key);
                tryToUnlock(rooms.get(key), unlockedRooms, rooms);
            }
        }
    }
}
