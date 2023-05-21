package dev.drf.leetcode.asteroid.collision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsteroidCollisionProblemTest {
//    private final AsteroidCollisionProblem problem = new AsteroidCollisionProblem();
    private final AsteroidCollisionProblem2 problem = new AsteroidCollisionProblem2();

    @Test
    void example1() {
        /*
        Input: asteroids = [5,10,-5]
        Output: [5,10]
         */
        int[] asteroids = new int[]{5, 10, -5};

        var values = problem.asteroidCollision(asteroids);

        assertEquals(2, values.length);
        assertEquals(5, values[0]);
        assertEquals(10, values[1]);
    }

    @Test
    void example2() {
        /*
        Input: asteroids = [8,-8]
        Output: []
         */
        int[] asteroids = new int[]{8, -8};

        var values = problem.asteroidCollision(asteroids);

        assertEquals(0, values.length);
    }

    @Test
    void example3() {
        /*
        Input: asteroids = [10,2,-5]
        Output: [10]
         */
        int[] asteroids = new int[]{10, 2, -5};

        var values = problem.asteroidCollision(asteroids);

        assertEquals(1, values.length);
        assertEquals(10, values[0]);
    }

    @Test
    void failed1() {
        // -2,-1,1,2
        int[] asteroids = new int[]{-2, -1, 1, 2};

        var values = problem.asteroidCollision(asteroids);

        assertEquals(4, values.length);

        assertEquals(-2, values[0]);
        assertEquals(-1, values[1]);
        assertEquals(1, values[2]);
        assertEquals(2, values[3]);
    }

    @Test
    void failed2() {
        //[-2,-2,1,-2]

        int[] asteroids = new int[]{-2, -2, 1, -2};

        var values = problem.asteroidCollision(asteroids);

        assertEquals(3, values.length);

        assertEquals(-2, values[0]);
        assertEquals(-2, values[1]);
        assertEquals(-2, values[2]);
    }

    @Test
    void failed3() {
        // [-2,1,1,-2]
        int[] asteroids = new int[]{-2, 1, 1, -2};

        var values = problem.asteroidCollision(asteroids);

        assertEquals(2, values.length);

        assertEquals(-2, values[0]);
        assertEquals(-2, values[1]);
    }

    @Test
    void failed4() {
        // [-2,2,1,-2]
        int[] asteroids = new int[]{-2, 2, 1, -2};

        var values = problem.asteroidCollision(asteroids);

        assertEquals(1, values.length);

        assertEquals(-2, values[0]);
    }
}
