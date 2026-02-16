package dev.drf.leetcode.letter.tile.possibilities;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/letter-tile-possibilities/
 */
public class LetterTilePossibilitiesProblem implements Problem {
    public int numTilePossibilities(String tiles) {
        var map = new HashMap<Character, Counter>(32);
        var sum = new Counter();

        final var chars = tiles.toCharArray();
        for (char ch : chars) {
            map.compute(ch, (character, counter) -> {
                if (counter == null) {
                    counter = new Counter();
                }
                counter.value++;
                return counter;
            });
        }

        sumTiles(map, sum);

        return sum.value;
    }

    private void sumTiles(HashMap<Character, Counter> map,
                          Counter sum) {
        var keys = map.keySet();
        for (Character key : keys) {
            var counter = map.get(key);
            if (counter.value > 0) {
                counter.value--;
                sumTiles(map, sum);
                sum.value++;
                counter.value++;
            }
        }
    }

    private static class Counter {
        public int value = 0;
    }
}
