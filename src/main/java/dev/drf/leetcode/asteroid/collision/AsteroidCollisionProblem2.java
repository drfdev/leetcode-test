package dev.drf.leetcode.asteroid.collision;

import dev.drf.leetcode.Problem;

import java.util.LinkedList;

/**
 * Solution:
 * https://leetcode.com/problems/asteroid-collision/solutions/109694/java-c-clean-code/
 */
public class AsteroidCollisionProblem2 implements Problem {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> s = new LinkedList<>();
        for (int i : asteroids) {
            if (i > 0) {
                s.add(i);
            } else {
                while (!s.isEmpty() && s.getLast() > 0 && s.getLast() < -i) {
                    s.pollLast();
                }
                if (!s.isEmpty() && s.getLast() == -i) {
                    s.pollLast();
                } else if (s.isEmpty() || s.getLast() < 0) {
                    s.add(i);
                }
            }
        }
        return s.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
