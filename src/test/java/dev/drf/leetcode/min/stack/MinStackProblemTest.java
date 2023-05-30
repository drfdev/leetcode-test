package dev.drf.leetcode.min.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["MinStack","push","push","push","getMin","pop","top","getMin"]
        [[],[-2],[0],[-3],[],[],[],[]]

        Output
        [null,null,null,null,-3,null,0,-2]
         */

        var minStack = new MinStackProblem.MinStack();

        /*
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
         */
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        var a1 = minStack.getMin(); // return -3
        minStack.pop();
        var a2 = minStack.top();    // return 0
        var a3 = minStack.getMin(); // return -2

        assertEquals(-3, a1);
        assertEquals(0, a2);
        assertEquals(-2, a3);
    }
}
