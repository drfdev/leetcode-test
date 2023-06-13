package dev.drf.leetcode.path.sum.ii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSumIIProblemTest {
    private final PathSumIIProblem problem = new PathSumIIProblem();

    @Test
    void example1() {
        /*
        Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
        Output: [[5,4,11,2],[5,8,4,5]]
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(1))));

        var res = problem.pathSum(root, 22);

        System.out.println(res);
        assertThat(res, containsInAnyOrder(
                containsInAnyOrder(5, 4, 11, 2),
                containsInAnyOrder(5, 8, 4, 5)
        ));
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,3], targetSum = 5
        Output: []
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        var res = problem.pathSum(root, 5);

        System.out.println(res);
        assertTrue(res.isEmpty());
    }

    @Test
    void example3() {
        /*
        Input: root = [1,2], targetSum = 0
        Output: []
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                null);

        var res = problem.pathSum(root, 0);

        System.out.println(res);
        assertTrue(res.isEmpty());
    }
}
