package dev.drf.leetcode.kids.with.the.greatest.number.of.candies;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class KidsWithTheGreatestNumberOfCandiesProblemTest {
    private final KidsWithTheGreatestNumberOfCandiesProblem problem = new KidsWithTheGreatestNumberOfCandiesProblem();

    @Test
    void example1() {
        /*
        Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]
         */
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        var res = problem.kidsWithCandies(candies, extraCandies);

        assertThat(res, contains(
                true, true, true, false, true
        ));
    }

    @Test
    void example2() {
        /*
        Input: candies = [4,2,1,1,2], extraCandies = 1
        Output: [true,false,false,false,false]
         */
        int[] candies = new int[]{4, 2, 1, 1, 2};
        int extraCandies = 1;

        var res = problem.kidsWithCandies(candies, extraCandies);

        assertThat(res, contains(
                true, false, false, false, false
        ));
    }

    @Test
    void example3() {
        /*
        Input: candies = [12,1,12], extraCandies = 10
        Output: [true,false,true]
         */
        int[] candies = new int[]{12, 1, 12};
        int extraCandies = 10;

        var res = problem.kidsWithCandies(candies, extraCandies);

        assertThat(res, contains(
                true, false, true
        ));
    }
}
