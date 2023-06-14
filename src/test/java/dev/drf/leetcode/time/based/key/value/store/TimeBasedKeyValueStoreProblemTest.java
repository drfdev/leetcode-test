package dev.drf.leetcode.time.based.key.value.store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeBasedKeyValueStoreProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["TimeMap", "set", "get", "get", "set", "get", "get"]
        [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
        Output
        [null, null, "bar", "bar", null, "bar2", "bar2"]

        Explanation
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
        timeMap.get("foo", 1);         // return "bar"
        timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
        timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
        timeMap.get("foo", 4);         // return "bar2"
        timeMap.get("foo", 5);         // return "bar2"
         */
        var timeMap = new TimeBasedKeyValueStoreProblem2.TimeMap();
        timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
        var res1 = timeMap.get("foo", 1);         // return "bar"
        var res2 = timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
        timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
        var res3 = timeMap.get("foo", 4);         // return "bar2"
        var res4 = timeMap.get("foo", 5);         // return "bar2"

        assertEquals("bar", res1);
        assertEquals("bar", res2);
        assertEquals("bar2", res3);
        assertEquals("bar2", res4);
    }

    @Test
    void failed1() {
        /*
        ["TimeMap","set","set","get","get","get","get","get"]
        [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
        expected:
        [null,null,null,"","high","high","low","low"]
         */
        var timeMap = new TimeBasedKeyValueStoreProblem2.TimeMap();
        timeMap.set("love", "high", 10);
        timeMap.set("love", "low", 20);
        var res1 = timeMap.get("love", 5); // "",
        var res2 = timeMap.get("love", 10); // "high",
        var res3 = timeMap.get("love", 15); // "high",
        var res4 = timeMap.get("love", 20); // "low",
        var res5 = timeMap.get("love", 25); // "low"

        assertEquals("", res1);
        assertEquals("high", res2);
        assertEquals("high", res3);
        assertEquals("low", res4);
        assertEquals("low", res5);
    }
}
