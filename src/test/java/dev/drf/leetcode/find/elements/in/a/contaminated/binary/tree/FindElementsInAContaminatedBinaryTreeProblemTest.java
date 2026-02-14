package dev.drf.leetcode.find.elements.in.a.contaminated.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindElementsInAContaminatedBinaryTreeProblemTest {
    private final FindElementsInAContaminatedBinaryTreeProblem problem = new FindElementsInAContaminatedBinaryTreeProblem();

    @Test
    void example1() {
        // Input
        // ["FindElements","find","find"]
        // [[[-1,null,-1]],[1],[2]]
        // Output
        // [null,false,true]
        TreeNode root = new TreeNode(-1,
                null,
                new TreeNode(-1));

        var findElements = new FindElementsInAContaminatedBinaryTreeProblem.FindElements(root);
        var find1 = findElements.find(1); // return False
        var find2 = findElements.find(2); // return True

        assertFalse(find1);
        assertTrue(find2);
    }

    @Test
    void example2() {
        // Input
        // ["FindElements","find","find","find"]
        // [[[-1,-1,-1,-1,-1]],[1],[3],[5]]
        // Output
        // [null,true,true,false]
        TreeNode root = new TreeNode(-1,
                new TreeNode(-1,
                        new TreeNode(-1),
                        new TreeNode(-1)),
                new TreeNode(-1));

        var findElements = new FindElementsInAContaminatedBinaryTreeProblem.FindElements(root);
        var find1 = findElements.find(1); // return True
        var find2 = findElements.find(3); // return True
        var find3 = findElements.find(5); // return False

        assertTrue(find1);
        assertTrue(find2);
        assertFalse(find3);
    }
}
