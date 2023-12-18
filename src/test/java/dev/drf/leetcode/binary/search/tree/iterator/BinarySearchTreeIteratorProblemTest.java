package dev.drf.leetcode.binary.search.tree.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeIteratorProblemTest {
    @Test
    void example1() {
        /*
Input
["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
Output
[null, 3, 7, true, 9, true, 15, true, 20, false]

Explanation
BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
bSTIterator.next();    // return 3
bSTIterator.next();    // return 7
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 9
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 15
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 20
bSTIterator.hasNext(); // return False
         */
        var root = new TreeNode(7,
                new TreeNode(3),
                new TreeNode(15,
                        new TreeNode(9),
                        new TreeNode(20)));
        var bSTIterator = new BinarySearchTreeIteratorProblem.BSTIterator(root);
        assertEquals(3, bSTIterator.next());    // return 3
        assertEquals(7, bSTIterator.next());    // return 7
        assertTrue(bSTIterator.hasNext()); // return True
        assertEquals(9, bSTIterator.next());    // return 9
        assertTrue(bSTIterator.hasNext()); // return True
        assertEquals(15, bSTIterator.next());    // return 15
        assertTrue(bSTIterator.hasNext()); // return True
        assertEquals(20, bSTIterator.next());    // return 20
        assertFalse(bSTIterator.hasNext()); // return False
    }
}
