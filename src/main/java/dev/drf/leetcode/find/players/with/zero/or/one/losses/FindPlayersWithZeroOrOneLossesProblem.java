package dev.drf.leetcode.find.players.with.zero.or.one.losses;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-players-with-zero-or-one-losses/
 */
public class FindPlayersWithZeroOrOneLossesProblem implements Problem {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, int[]> players = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            int[] winnerScore = players.computeIfAbsent(winner, unused -> new int[2]);
            int[] loserScore = players.computeIfAbsent(loser, unused -> new int[2]);

            winnerScore[0]++;
            loserScore[1]++;
        }

        List<Integer> zeroLose = new ArrayList<>();
        List<Integer> singleLose = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(zeroLose);
        result.add(singleLose);

        for (Map.Entry<Integer, int[]> entry : players.entrySet()) {
            int player = entry.getKey();
            int[] score = entry.getValue();

            if (score[1] == 0) {
                zeroLose.add(player);
            } else if (score[1] == 1) {
                singleLose.add(player);
            }
        }

        zeroLose.sort(Integer::compareTo);
        singleLose.sort(Integer::compareTo);

        return result;
    }
}
