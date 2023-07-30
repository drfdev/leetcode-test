package dev.drf.leetcode.design.twitter;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/design-twitter/
 * Used solution:
 * https://www.youtube.com/watch?v=pNichitDD2E
 */
public class DesignTwitterProblem implements Problem {
    public static class Twitter {
        private int count;
        private HashMap<Integer, List<int[]>> tweetMap;
        private HashMap<Integer, HashSet<Integer>> followerMap;

        public Twitter() {
            this.count = 0;
            this.tweetMap = new HashMap<>();
            this.followerMap = new HashMap<>();
        }

        public void postTweet(int userId, int tweetId) {
            tweetMap.computeIfAbsent(userId,
                    k -> new ArrayList<>()
            );

            tweetMap.computeIfPresent(userId, (k, v) -> {
                v.add(new int[]{count, tweetId});
                return v;
            });

            ++count;
        }

        public List<Integer> getNewsFeed(int userId) {
            List<Integer> res = new ArrayList<>();

            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
                    Integer.compare(b[0], a[0])
            );

            followerMap.computeIfAbsent(userId,
                    k -> new HashSet<>()
            );

            followerMap.get(userId).add(userId);

            followerMap.get(userId).forEach((followeeId) -> {
                if (tweetMap.containsKey(followeeId)) {
                    int i = tweetMap.get(followeeId).size() - 1;
                    int[] tweet = tweetMap.get(followeeId).get(i);
                    pq.offer(new int[]{tweet[0], tweet[1],
                            followeeId, --i});
                }
            });

            while (!pq.isEmpty() && res.size() < 10) {
                int[] data = pq.poll();
                res.add(data[1]);

                if (data[3] >= 0) {
                    int[] tweet = tweetMap.get(data[2]).get(data[3]);
                    pq.offer(new int[]{tweet[0], tweet[1],
                            data[2], --data[3]});
                }
            }

            return res;
        }

        public void follow(int followerId, int followeeId) {
            followerMap.computeIfAbsent(followerId,
                    k -> new HashSet<>());

            followerMap.computeIfPresent(followerId, (k, v) -> {
                v.add(followeeId);
                return v;
            });
        }

        public void unfollow(int followerId, int followeeId) {
            HashSet<Integer> set = followerMap.computeIfAbsent(followerId,
                    k -> new HashSet<>());

            if (set.contains(followeeId)) {
                set.remove(followeeId);
            }
        }
    }
}
