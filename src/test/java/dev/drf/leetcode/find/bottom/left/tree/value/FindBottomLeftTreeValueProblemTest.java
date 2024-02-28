package dev.drf.leetcode.find.bottom.left.tree.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindBottomLeftTreeValueProblemTest {
    private final FindBottomLeftTreeValueProblem problem = new FindBottomLeftTreeValueProblem();

    @Test
    void example1() {
        /*
        Input: root = [2,1,3]
        Output: 1
         */
        var root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        var out = problem.findBottomLeftValue(root);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,3,4,null,5,6,null,null,7]
        Output: 7
         */
        var root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        null),
                new TreeNode(3,
                        new TreeNode(5,
                                new TreeNode(7),
                                null),
                        new TreeNode(6)));

        var out = problem.findBottomLeftValue(root);

        assertEquals(7, out);
    }
}
