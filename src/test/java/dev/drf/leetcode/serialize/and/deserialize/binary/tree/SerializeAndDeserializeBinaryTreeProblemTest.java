package dev.drf.leetcode.serialize.and.deserialize.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SerializeAndDeserializeBinaryTreeProblemTest {
    @Test
    void example1() {
        /*
        Input: root = [1,2,3,null,null,4,5]
        Output: [1,2,3,null,null,4,5]
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        var codec = new SerializeAndDeserializeBinaryTreeProblem.Codec();
        var tree = codec.deserialize(codec.serialize(root));

        assertNotNull(tree);
        assertEquals(1, tree.val);
        assertEquals(2, tree.left.val);
        assertEquals(3, tree.right.val);
        assertEquals(4, tree.right.left.val);
        assertEquals(5, tree.right.right.val);
    }

    @Test
    void example2() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var codec = new SerializeAndDeserializeBinaryTreeProblem.Codec();
        var tree = codec.deserialize(codec.serialize(root));

        assertNull(tree);
    }
}
