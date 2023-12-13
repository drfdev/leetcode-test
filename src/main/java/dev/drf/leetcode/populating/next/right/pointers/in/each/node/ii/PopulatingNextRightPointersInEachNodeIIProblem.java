package dev.drf.leetcode.populating.next.right.pointers.in.each.node.ii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 */
public class PopulatingNextRightPointersInEachNodeIIProblem implements Problem {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        if (root.right != null) {
            root.right.next = getNext(root.next);
        }
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = getNext(root.next);
            }
        }

        connect(root.right);
        connect(root.left);

        return root;
    }

    private Node getNext(Node next) {
        Node cursor = next;
        while (cursor != null) {
            if (cursor.left != null) {
                return cursor.left;
            }
            if (cursor.right != null) {
                return cursor.right;
            }
            cursor = cursor.next;
        }
        return null;
    }
}
