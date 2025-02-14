package dev.drf.leetcode.product.of.the.last.k.numbers;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/product-of-the-last-k-numbers/
 * Used solution:
 * https://leetcode.com/problems/product-of-the-last-k-numbers/solutions/510260/java-c-python-prefix-product/
 */
public class ProductOfTheLastKNumbersProblem implements Problem {
    public static class ProductOfNumbers {

        private final List<Integer> innerList;

        public ProductOfNumbers() {
            this.innerList = new ArrayList<>();
            this.innerList.add(1);
        }

        public void add(int num) {
            if (num > 0) {
                final int lastIndex = innerList.size() - 1;
                final int lastValue = innerList.get(lastIndex);
                innerList.add(lastValue * num);
            } else {
                innerList.clear();
                innerList.add(1);
            }
        }

        public int getProduct(int k) {
            final int size = innerList.size();
            return k < size
                    ? innerList.get(size - 1) / innerList.get(size - k - 1)
                    : 0;
        }
    }

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
}
