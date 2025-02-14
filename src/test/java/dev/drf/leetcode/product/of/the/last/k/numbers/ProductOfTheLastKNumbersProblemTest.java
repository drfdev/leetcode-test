package dev.drf.leetcode.product.of.the.last.k.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfTheLastKNumbersProblemTest {
    @Test
    void example1() {
        // Input
        // ["ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct"]
        // [[],[3],[0],[2],[5],[4],[2],[3],[4],[8],[2]]
        // Output
        // [null,null,null,null,null,null,20,40,0,null,32]

        var productOfNumbers = new ProductOfTheLastKNumbersProblem.ProductOfNumbers();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        var res1 = productOfNumbers.getProduct(2); // return 20. The product of the last 2 numbers is 5 * 4 = 20
        var res2 = productOfNumbers.getProduct(3); // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40
        var res3 = productOfNumbers.getProduct(4); // return 0. The product of the last 4 numbers is 0 * 2 * 5 * 4 = 0
        productOfNumbers.add(8);        // [3,0,2,5,4,8]
        var res4 = productOfNumbers.getProduct(2); // return 32. The product of the last 2 numbers is 4 * 8 = 32

        assertEquals(20, res1);
        assertEquals(40, res2);
        assertEquals(0, res3);
        assertEquals(32, res4);
    }
}
