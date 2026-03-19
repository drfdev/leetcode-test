package dev.drf.leetcode.all.elements.in.two.binary.search.trees;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
 */
public class AllElementsInTwoBinarySearchTreesProblem implements Problem {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        fillValueList(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        fillValueList(root2, list2);

        final int size = list1.size() + list2.size();
        List<Integer> result = new ArrayList<>(size);

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < size; i++) {
            var value1 = index1 < list1.size()
                    ? list1.get(index1)
                    : Integer.MAX_VALUE;
            var value2 = index2 < list2.size()
                    ? list2.get(index2)
                    : Integer.MAX_VALUE;

            if (value1 < value2) {
                result.add(value1);
                index1++;
            } else {
                result.add(value2);
                index2++;
            }
        }

        return result;
    }

    private void fillValueList(TreeNode node,
                               List<Integer> list) {
        if (node == null) {
            return;
        }
        fillValueList(node.left, list);
        list.add(node.val);
        fillValueList(node.right, list);
    }
}
