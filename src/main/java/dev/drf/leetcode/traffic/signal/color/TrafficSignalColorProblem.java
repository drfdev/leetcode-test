package dev.drf.leetcode.traffic.signal.color;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/traffic-signal-color/
 */
public class TrafficSignalColorProblem implements Problem {
    public String trafficSignal(int timer) {
        /*
        If timer == 0, the signal is "Green"
        If timer == 30, the signal is "Orange"
        If 30 < timer <= 90, the signal is "Red"
         */
        if (timer == 0) {
            return "Green";
        } else if (timer == 30) {
            return "Orange";
        } else if (timer > 30 && timer <= 90) {
            return "Red";
        }
        return "Invalid";
    }
}
