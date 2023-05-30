package dev.drf.leetcode.min.stack;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/min-stack/
 */
public class MinStackProblem implements Problem {
    public static class MinStack {
        private StackBock top = null;

        public MinStack() {
            // noOp
        }

        public void push(int val) {
            StackBock next = new StackBock();
            next.value = val;

            if (this.top != null) {
                next.min = Math.min(this.top.min, val);
            } else {
                next.min = val;
            }

            next.bottom = this.top;
            this.top = next;
        }

        public void pop() {
            if (top != null) {
                this.top = this.top.bottom;
            }
        }

        public int top() {
            if (top == null) {
                throw new IllegalStateException();
            }
            return top.value;
        }

        public int getMin() {
            if (top == null) {
                throw new IllegalStateException();
            }
            return top.min;
        }
    }

    private static class StackBock {
        private int value;
        private int min;
        private StackBock bottom;
    }
}
