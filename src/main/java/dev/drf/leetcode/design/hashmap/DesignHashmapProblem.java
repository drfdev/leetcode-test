package dev.drf.leetcode.design.hashmap;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/design-hashmap
 */
public class DesignHashmapProblem implements Problem {
    public static class MyHashMap {
        private final Bucket[] buckets;

        public MyHashMap() {
            this.buckets = new Bucket[16];
        }

        public void put(int key, int value) {
            int index = key % 16;
            Bucket bucket = buckets[index];
            if (bucket == null) {
                bucket = new Bucket(key, value);
                buckets[index] = bucket;
            } else {
                Bucket cursor = bucket;
                Bucket prev = null;
                while (cursor != null) {
                    if (cursor.key == key) {
                        cursor.value = value;
                        return;
                    }
                    prev = cursor;
                    cursor = cursor.next;
                }
                Bucket newBucket = new Bucket(key, value);
                prev.next = newBucket;
            }
        }

        public int get(int key) {
            int index = key % 16;
            Bucket bucket = buckets[index];
            if (bucket == null) {
                return -1;
            }
            Bucket cursor = bucket;
            while (cursor != null) {
                if (cursor.key == key) {
                    return cursor.value;
                }
                cursor = cursor.next;
            }

            return -1;
        }

        public void remove(int key) {
            int index = key % 16;
            Bucket bucket = buckets[index];
            if (bucket != null) {
                Bucket cursor = bucket;
                Bucket prev = null;
                while (cursor != null) {
                    if (cursor.key == key) {
                        break;
                    }
                    prev = cursor;
                    cursor = cursor.next;
                }
                if (cursor != null) {
                    if (prev != null) {
                        prev.next = cursor.next;
                    } else {
                        buckets[index] = cursor.next;
                    }
                }
            }
        }

        private static class Bucket {
            private int key;
            private int value;
            private Bucket next;

            public Bucket(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
