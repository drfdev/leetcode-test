package dev.drf.leetcode.insert.delete.getrandom.o1;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1/
 */
public class InsertDeleteGetRandomO1Problem implements Problem {
    public static class RandomizedSet {
        private final Set<Integer> hiddenSet;
        private Integer[] arr;
        private java.util.Random rand = new java.util.Random();

        public RandomizedSet() {
            this.hiddenSet = new HashSet<>();
            this.arr = null;
        }

        public boolean insert(int val) {
            this.arr = null;
            return hiddenSet.add(val);
        }

        public boolean remove(int val) {
            this.arr = null;
            return hiddenSet.remove(val);
        }

        public int getRandom() {
            if (arr == null) {
                arr = hiddenSet.toArray(Integer[]::new);
            }
            return arr[rand.nextInt(arr.length)];
        }
    }
}
