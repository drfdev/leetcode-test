package dev.drf.leetcode.find.the.highest.altitude;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-the-highest-altitude/
 */
public class FindTheHighestAltitudeProblem implements Problem {
    public int largestAltitude(int[] gain) {
        if (gain == null) {
            return 0;
        }

        int previousPoint = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            int nextGain = gain[i];

            int altitude = previousPoint + nextGain;
            maxAltitude = Math.max(maxAltitude, altitude);

            previousPoint = altitude;
        }

        return maxAltitude;
    }
}
