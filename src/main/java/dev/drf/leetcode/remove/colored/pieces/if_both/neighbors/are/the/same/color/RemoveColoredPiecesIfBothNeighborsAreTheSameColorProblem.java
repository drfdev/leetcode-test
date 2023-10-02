package dev.drf.leetcode.remove.colored.pieces.if_both.neighbors.are.the.same.color;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color
 */
public class RemoveColoredPiecesIfBothNeighborsAreTheSameColorProblem implements Problem {
    private static final char ALICE = 'A';
    private static final char BOB = 'B';

    public boolean winnerOfGame(String colors) {
        if (colors == null || colors.length() < 3) {
            return false;
        }

        List<Bucket> forAlice = new ArrayList<>();
        List<Bucket> forBob = new ArrayList<>();

        char[] chars = colors.toCharArray();
        char prevCh = chars[0];
        Bucket bucket = new Bucket();
        if (prevCh == ALICE) {
            forAlice.add(bucket);
        } else {
            forBob.add(bucket);
        }

        for (char ch : chars) {
            if (ch == prevCh) {
                bucket.count++;
            } else {
                prevCh = ch;
                bucket = new Bucket();
                bucket.count++;

                if (prevCh == ALICE) {
                    forAlice.add(bucket);
                } else {
                    forBob.add(bucket);
                }
            }
        }

        PriorityQueue<Bucket> aliceBucket = new PriorityQueue<>((b1, b2) -> Integer.compare(b2.count, b1.count));
        PriorityQueue<Bucket> bobBucket = new PriorityQueue<>((b1, b2) -> Integer.compare(b2.count, b1.count));
        aliceBucket.addAll(forAlice);
        bobBucket.addAll(forBob);

        while (true) {
            // alice turn
            Bucket alice = aliceBucket.poll();
            if (alice == null) {
                return false;
            }
            if (alice.count > 2) {
                alice.count--;
                aliceBucket.add(alice);
            } else {
                return false;
            }

            // bob turn
            Bucket bob = bobBucket.poll();
            if (bob == null) {
                return true;
            }
            if (bob.count > 2) {
                bob.count--;
                bobBucket.add(bob);
            } else {
                return true;
            }
        }
    }

    private static class Bucket {
        private int count = 0;
    }
}
