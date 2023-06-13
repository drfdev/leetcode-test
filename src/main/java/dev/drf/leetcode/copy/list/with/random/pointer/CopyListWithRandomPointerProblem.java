package dev.drf.leetcode.copy.list.with.random.pointer;

import dev.drf.leetcode.Problem;

import java.util.IdentityHashMap;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 */
public class CopyListWithRandomPointerProblem implements Problem {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node copy = null;
        Node copyHead = null;
        Node cursor = head;

        IdentityHashMap<Node, Node> copiedNodes = new IdentityHashMap<>();

        while (cursor != null) {
            if (copy == null) {
                copy = new Node(cursor.val);
                copyHead = copy;
            } else {
                copy.next = new Node(cursor.val);
                copy = copy.next;
            }

            copiedNodes.put(cursor, copy);

            cursor = cursor.next;
        }

        cursor = head;
        Node copiedCursor = copyHead;

        while (cursor != null) {
            Node random = cursor.random;
            if (random != null) {
                Node copiedNode = copiedNodes.get(random);
                copiedCursor.random = copiedNode;
            }

            cursor = cursor.next;
            copiedCursor = copiedCursor.next;
        }

        return copyHead;
    }
}
