package dev.drf.leetcode.linked.list.cycle;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycleProblem implements Problem {

    public boolean hasCycle(ListNode head) {
        var rabbit = head;
        var turtle = head;

        while (rabbit != null && turtle != null) {
            rabbit = moveRabbit(rabbit);
            turtle = moveTurtle(turtle);

            if (turtle != null && rabbit == turtle) {
                return true;
            }
        }
        return false;
    }

    private ListNode moveRabbit(ListNode rabbit) {
        var firstJump = rabbit.next;
        if (firstJump != null) {
            return firstJump.next;
        }
        return null;
    }

    private ListNode moveTurtle(ListNode turtle) {
        return turtle.next;
    }
}
