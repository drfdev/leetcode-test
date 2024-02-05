package dev.drf.leetcode.jewels.and.stones;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStonesProblem implements Problem {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelTypeSet = new HashSet<>();

        char[] jwls = jewels.toCharArray();
        for (char jwl : jwls) {
            jewelTypeSet.add(jwl);
        }

        int count = 0;
        char[] stns = stones.toCharArray();
        for (char stn : stns) {
            if (jewelTypeSet.contains(stn)) {
                count++;
            }
        }

        return count;
    }
}
