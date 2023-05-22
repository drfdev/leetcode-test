package dev.drf.leetcode.number.of.recent.calls;

import dev.drf.leetcode.Problem;

import java.util.TreeSet;

/**
 * https://leetcode.com/problems/number-of-recent-calls/
 * Solution used:
 * https://leetcode.com/problems/number-of-recent-calls/solutions/189239/java-python-3-five-solutions-treemap-treeset-arraylist-queue-circular-list/
 */
@Deprecated
public class NumberOfRecentCallsProblem implements Problem {

    public static final class RecentCounter {

        TreeSet<Integer> ts;

        public RecentCounter() {
            ts = new TreeSet<>();
        }

        public int ping(int t) {
            ts.add(t);
            return ts.tailSet(t - 3000).size();
        }
    }
}
