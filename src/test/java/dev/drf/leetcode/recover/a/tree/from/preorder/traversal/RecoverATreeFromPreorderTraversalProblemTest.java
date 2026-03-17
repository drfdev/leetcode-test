package dev.drf.leetcode.recover.a.tree.from.preorder.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoverATreeFromPreorderTraversalProblemTest {
    private final RecoverATreeFromPreorderTraversalProblem problem = new RecoverATreeFromPreorderTraversalProblem();

    @Test
    void example1() {
        // Input: traversal = "1-2--3--4-5--6--7"
        // Output: [1,2,5,3,4,6,7]
        String traversal = "1-2--3--4-5--6--7";

        var root = problem.recoverFromPreorder(traversal);

        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.left.left.val);
        assertEquals(4, root.left.right.val);
        assertEquals(5, root.right.val);
        assertEquals(6, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }

    @Test
    void example2() {
        // Input: traversal = "1-2--3---4-5--6---7"
        // Output: [1,2,5,3,null,6,null,4,null,7]
        String traversal = "1-2--3---4-5--6---7";

        var root = problem.recoverFromPreorder(traversal);

        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.left.left.val);
        assertEquals(4, root.left.left.left.val);
        assertEquals(5, root.right.val);
        assertEquals(6, root.right.left.val);
        assertEquals(7, root.right.left.left.val);
    }

    @Test
    void example3() {
        // Input: traversal = "1-401--349---90--88"
        // Output: [1,401,null,349,88,90]
        String traversal = "1-401--349---90--88";

        var root = problem.recoverFromPreorder(traversal);

        assertEquals(1, root.val);
        assertEquals(401, root.left.val);
        assertEquals(349, root.left.left.val);
        assertEquals(90, root.left.left.left.val);
        assertEquals(88, root.left.right.val);
    }
}
