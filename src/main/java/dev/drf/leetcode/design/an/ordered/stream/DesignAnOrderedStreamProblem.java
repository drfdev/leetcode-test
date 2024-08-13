package dev.drf.leetcode.design.an.ordered.stream;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/design-an-ordered-stream/
 */
public class DesignAnOrderedStreamProblem implements Problem {
    public static class OrderedStream {
        private final String[] arr;
        private int ptr = 0;

        public OrderedStream(int n) {
            this.arr = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            final int index = idKey - 1;
            this.arr[index] = value;

            if (this.ptr == index) {
                var result = new ArrayList<String>();
                int tempIndex = ptr;

                while (tempIndex < arr.length
                        && this.arr[tempIndex] != null) {
                    result.add(this.arr[tempIndex]);
                    tempIndex++;
                }
                this.ptr = tempIndex;

                return result;
            }

            return List.of();
        }
    }
}
