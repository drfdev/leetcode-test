package dev.drf.leetcode.implement.queue.using.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImplementQueueUsingStacksProblemTest {
    @Test
    void example1() {
        /*
        Input
        ["MyQueue", "push", "push", "peek", "pop", "empty"]
        [[], [1], [2], [], [], []]
        Output
        [null, null, null, 1, 1, false]
         */

        var myQueue = new ImplementQueueUsingStacksProblem.MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        var peek1 = myQueue.peek(); // return 1
        var pop1 = myQueue.pop(); // return 1, queue is [2]
        var empty1 = myQueue.empty(); // return false

        assertEquals(1, peek1);
        assertEquals(1, pop1);
        assertFalse(empty1);
    }
}
