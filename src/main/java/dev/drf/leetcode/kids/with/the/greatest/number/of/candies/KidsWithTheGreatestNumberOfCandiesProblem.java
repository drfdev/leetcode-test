package dev.drf.leetcode.kids.with.the.greatest.number.of.candies;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class KidsWithTheGreatestNumberOfCandiesProblem implements Problem {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = getMax(candies);
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxValue);
        }
        return result;
    }

    private int getMax(int[] candies) {
        int max = -1;
        for (int value : candies) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
