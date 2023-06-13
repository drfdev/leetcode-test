package dev.drf.leetcode.lru.cache;

import dev.drf.leetcode.Problem;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/lru-cache/
 * Used solution:
 * https://leetcode.com/problems/lru-cache/solutions/45911/java-hashtable-double-linked-list-with-a-touch-of-pseudo-nodes/
 */
public class LruCacheProblem implements Problem {
    public static class LRUCache {

        private final HashMap<Integer, LRUNode> cache = new HashMap<>();
        private int count;
        private int capacity;
        private LRUNode head;
        private LRUNode tail;


        public LRUCache(int capacity) {
            this.count = 0;
            this.capacity = capacity;

            head = new LRUNode();
            head.prev = null;

            tail = new LRUNode();
            tail.next = null;

            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            LRUNode node = cache.get(key);
            if (node == null) {
                return -1;
            }
            moveToHead(node);

            return node.value;
        }

        public void put(int key, int value) {
            LRUNode node = cache.get(key);

            if (node == null) {
                LRUNode newNode = new LRUNode();
                newNode.key = key;
                newNode.value = value;

                cache.put(key, newNode);
                addNode(newNode);

                count++;

                if (count > capacity) {
                    LRUNode tail = popTail();
                    cache.remove(tail.key);
                    count--;
                }
            } else {
                node.value = value;
                moveToHead(node);
            }
        }

        private void addNode(LRUNode node) {
            node.prev = head;
            node.next = head.next;

            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(LRUNode node) {
            LRUNode pre = node.prev;
            LRUNode post = node.next;

            pre.next = post;
            post.prev = pre;
        }

        private void moveToHead(LRUNode node) {
            removeNode(node);
            addNode(node);
        }

        private LRUNode popTail() {
            LRUNode res = tail.prev;
            removeNode(res);
            return res;
        }

        private static class LRUNode {
            int key;
            int value;
            LRUNode prev;
            LRUNode next;
        }
    }
}
