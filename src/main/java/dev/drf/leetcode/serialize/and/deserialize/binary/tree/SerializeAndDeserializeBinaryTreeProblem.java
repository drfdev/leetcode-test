package dev.drf.leetcode.serialize.and.deserialize.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */
public class SerializeAndDeserializeBinaryTreeProblem implements Problem {

    public static class Codec {
        private static final String SEPARATOR = ",";
        private static final String NULL_VALUE = "null";

        private enum Side {
            LEFT, RIGHT
        }

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();

            if (root != null) {
                sb.append(root.val);
                serializeNode(root.left, sb);
                serializeNode(root.right, sb);
            }

            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.isEmpty()) {
                return null;
            }
            String[] nodes = data.split(SEPARATOR);

            if (nodes.length > 0) {
                TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
                int index = deserializeNode(root, Side.LEFT, nodes, 1);
                deserializeNode(root, Side.RIGHT, nodes, index + 1);
                return root;
            }

            return null;
        }

        private void serializeNode(TreeNode node, StringBuilder sb) {
            if (node == null) {
                sb.append(SEPARATOR).append(NULL_VALUE);
                return;
            }

            sb.append(SEPARATOR).append(node.val);

            serializeNode(node.left, sb);
            serializeNode(node.right, sb);
        }

        private int deserializeNode(TreeNode parent, Side side, String[] nodes, int index) {
            String value = nodes[index];

            if (NULL_VALUE.equals(value)) {
                return index;
            }

            int intVal = Integer.parseInt(value);
            TreeNode nextNode = new TreeNode(intVal);

            if (side == Side.LEFT) {
                parent.left = nextNode;
            } else {
                parent.right = nextNode;
            }

            index = deserializeNode(nextNode, Side.LEFT, nodes, index + 1);
            index = deserializeNode(nextNode, Side.RIGHT, nodes, index + 1);

            return index;
        }
    }
}
