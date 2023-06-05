package dev.drf.leetcode.successful.pairs.of.spells.and.potions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuccessfulPairsOfSpellsAndPotionsProblemTest {
    private final SuccessfulPairsOfSpellsAndPotionsProblem problem = new SuccessfulPairsOfSpellsAndPotionsProblem();

    @Test
    void example1() {
        /*
        Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
        Output: [4,0,3]
         */
        int[] spells = new int[]{5, 1, 3};
        int[] potions = new int[]{1, 2, 3, 4, 5};
        int success = 7;

        var arr = problem.successfulPairs(spells, potions, success);

        assertEquals(4, arr[0]);
        assertEquals(0, arr[1]);
        assertEquals(3, arr[2]);
    }

    @Test
    void example2() {
        /*
        Input: spells = [3,1,2], potions = [8,5,8], success = 16
        Output: [2,0,2]
         */
        int[] spells = new int[]{3, 1, 2};
        int[] potions = new int[]{8, 5, 8};
        int success = 16;

        var arr = problem.successfulPairs(spells, potions, success);

        assertEquals(2, arr[0]);
        assertEquals(0, arr[1]);
        assertEquals(2, arr[2]);
    }

    @Test
    void failed1() {
        /*
        spells:
        [40,11,24,28,40,22,26,38,28,10,31,16,10,37,13,21,9,22,21,18,34,2,40,40,6,16,9,14,14,15,37,15,32,4,27,20,24,12,26,39,32,39,20,19,22,33,2,22,9,18,12,5]
        potions:
        [31,40,29,19,27,16,25,8,33,25,36,21,7,27,40,24,18,26,32,25,22,21,38,22,37,34,15,36,21,22,37,14,31,20,36,27,28,32,21,26,33,37,27,39,19,36,20,23,25,39,40]
        success:
        600
        expected:
        [48,0,32,37,48,22,33,47,37,0,43,6,0,46,0,21,0,22,21,14,46,0,48,48,0,6,0,0,0,3,46,3,45,0,34,20,32,0,33,47,45,47,20,18,22,45,0,22,0,14,0,0]
         */

        int[] spells = new int[]{
                40, 11, 24, 28, 40, 22, 26, 38, 28, 10, 31, 16, 10, 37, 13, 21, 9, 22, 21, 18, 34, 2, 40, 40, 6, 16, 9, 14, 14, 15, 37, 15, 32, 4, 27, 20, 24, 12, 26, 39, 32, 39, 20, 19, 22, 33, 2, 22, 9, 18, 12, 5
        };
        int[] potions = new int[]{
                31, 40, 29, 19, 27, 16, 25, 8, 33, 25, 36, 21, 7, 27, 40, 24, 18, 26, 32, 25, 22, 21, 38, 22, 37, 34, 15, 36, 21, 22, 37, 14, 31, 20, 36, 27, 28, 32, 21, 26, 33, 37, 27, 39, 19, 36, 20, 23, 25, 39, 40
        };
        int success = 600;

        var arr = problem.successfulPairs(spells, potions, success);

        assertMyArray(arr, 48, 0, 32, 37, 48, 22, 33, 47, 37, 0, 43, 6, 0, 46, 0, 21, 0, 22, 21, 14, 46, 0, 48, 48, 0, 6, 0, 0, 0, 3, 46, 3, 45, 0, 34, 20, 32, 0, 33, 47, 45, 47, 20, 18, 22, 45, 0, 22, 0, 14, 0, 0);
    }

    private void assertMyArray(int[] arr, int... values) {
        assertEquals(values.length, arr.length);
        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], arr[i], "index: " + i);
        }
    }
}
