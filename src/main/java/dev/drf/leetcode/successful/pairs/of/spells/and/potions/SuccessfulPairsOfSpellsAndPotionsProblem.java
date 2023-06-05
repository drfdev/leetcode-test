package dev.drf.leetcode.successful.pairs.of.spells.and.potions;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
 */
public class SuccessfulPairsOfSpellsAndPotionsProblem implements Problem {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        final int spellsCount = spells.length;
        final int potionsCount = potions.length;

        int[] result = new int[spellsCount];

        Arrays.sort(potions);

        for (int i = 0; i < spellsCount; i++) {
            int currentSpell = spells[i];
            // success <= spells[i] * potions[j]
            // potions[j] >= success / spells[i]
            int index = searchMinIndex(potions, currentSpell, success);

            result[i] = index < 0 ? potionsCount : potionsCount - index;
        }

        return result;
    }

    private int searchMinIndex(int[] potions, int spell, long success) {
        int left = 0;
        int right = potions.length - 1;
        while (left <= right) {
            int index = (right + left) / 2;
            long value = (long) potions[index] * spell;
            if (value >= success) {
                right = index - 1;
            } else {
                left = index + 1;
            }
        }
        return left;
    }
}
