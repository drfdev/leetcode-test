package dev.drf.leetcode.design.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesignHashmapProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
        [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
        Output
        [null, null, null, 1, -1, null, 1, null, -1]
         */

        /*
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
         */
        var myHashMap = new DesignHashmapProblem.MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        var res1 = myHashMap.get(1);
        var res2 = myHashMap.get(3);
        myHashMap.put(2, 1);
        var res3 = myHashMap.get(2);
        myHashMap.remove(2);
        var res4 = myHashMap.get(2);

        assertEquals(1, res1);
        assertEquals(-1, res2);
        assertEquals(1, res3);
        assertEquals(-1, res4);
    }
}
