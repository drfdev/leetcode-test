package dev.drf.leetcode.implement.queue.using.stacks;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class ImplementQueueUsingStacksProblem implements Problem {
    public static class MyQueue {
        private MyNode head;
        private MyNode tail;

        public MyQueue() {
            this.head = null;
            this.tail = null;
        }

        public void push(int x) {
            MyNode newNode = new MyNode(x);
            if (head == null) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                MyNode prTail = this.tail;
                prTail.next = newNode;
                this.tail = newNode;
            }
        }

        public int pop() {
            MyNode head = this.head;
            int popValue = head.value;
            this.head = head.next;
            return popValue;
        }

        public int peek() {
            return this.head.value;
        }

        public boolean empty() {
            return this.head == null;
        }

        private static class MyNode {
            private final int value;
            private MyNode next;

            public MyNode(int value) {
                this.value = value;
            }
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
