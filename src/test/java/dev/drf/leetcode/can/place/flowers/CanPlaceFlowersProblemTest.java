package dev.drf.leetcode.can.place.flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersProblemTest {
    private final CanPlaceFlowersProblem problem = new CanPlaceFlowersProblem();

    @Test
    void example1() {
        /*
        Input: flowerbed = [1,0,0,0,1], n = 1
        Output: true
         */
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        int n = 1;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: flowerbed = [1,0,0,0,1], n = 2
        Output: false
         */
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        int n = 2;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertFalse(res);
    }

    @Test
    void myTest1() {
        int[] flowerbed = new int[]{0};
        int n = 1;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertTrue(res);
    }

    @Test
    void myTest2() {
        int[] flowerbed = new int[]{0, 0};
        int n = 1;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertTrue(res);
    }

    @Test
    void myTest3() {
        int[] flowerbed = new int[]{0, 0};
        int n = 2;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertFalse(res);
    }

    @Test
    void myTest4() {
        int[] flowerbed = new int[]{0, 0, 0};
        int n = 2;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertTrue(res);
    }

    @Test
    void myTest5() {
        int[] flowerbed = new int[]{0, 1, 0};
        int n = 1;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertFalse(res);
    }

    @Test
    void myTest6() {
        int[] flowerbed = new int[]{1, 0, 0};
        int n = 1;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertTrue(res);
    }

    @Test
    void failed1() {
        int[] flowerbed = new int[]{0, 0, 1, 0, 0};
        int n = 1;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertTrue(res);
    }

    @Test
    void failed2() {
        int[] flowerbed = new int[]{0, 0, 0, 0, 0, 1, 0, 0};
        int n = 0;

        var res = problem.canPlaceFlowers(flowerbed, n);

        assertTrue(res);
    }
}
