package dev.drf.leetcode.asteroid.collision;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/asteroid-collision/
 */
@Deprecated
public class AsteroidCollisionProblem implements Problem {
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids == null) {
            return null;
        }
        if (asteroids.length == 1) {
            return asteroids;
        }

        int[] collisions = new int[asteroids.length];
        int cursor = 0;
        collisions[0] = asteroids[0];

        for (int i = 1; i < asteroids.length; i++) {
            int asteroid = asteroids[i];
            int survived = collisions[cursor];

            if (!isCollapsing(asteroid, survived)) {
                cursor++;
                collisions[cursor] = asteroid;
            } else {
                int ast = asteroid;
                int sur = survived;

                int absAsteroid = Math.abs(ast);
                int absSurvived = Math.abs(sur);

                if (absAsteroid == absSurvived) {
                    cursor--;
                } else if (absSurvived < absAsteroid) {
                    collisions[cursor] = ast;
                    cursor--;
                    sur = collisions[cursor];

                    while (isCollapsing(ast, sur)) {
                        absAsteroid = Math.abs(ast);
                        absSurvived = Math.abs(sur);

                        if (absAsteroid == absSurvived) {
                            cursor--;
                            break;
                        } else if (absSurvived < absAsteroid) {
                            collisions[cursor] = ast;
                            cursor--;
                            if (cursor < 0) {
                                break;
                            }
                            sur = collisions[cursor];
                        } else {
                            cursor--;
                            break;
                        }
                    }
                }
            }
        }

        int expectedSize = cursor + 1;
        if (expectedSize < collisions.length) {
            int[] buff = new int[expectedSize];
            System.arraycopy(collisions, 0, buff, 0, expectedSize);
            collisions = buff;
        }

        return collisions;
    }

    // positive - right
    // negative - left
    private boolean isCollapsing(int asteroid, int survived) {
        return survived > 0 && asteroid < 0;
    }
}
