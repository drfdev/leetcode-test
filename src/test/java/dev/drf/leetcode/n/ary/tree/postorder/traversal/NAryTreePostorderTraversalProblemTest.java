package dev.drf.leetcode.n.ary.tree.postorder.traversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NAryTreePostorderTraversalProblemTest {
    private final NAryTreePostorderTraversalProblem problem = new NAryTreePostorderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,null,3,2,4,null,5,6]
        Output: [5,6,3,2,4,1]
         */
        var root = new Node(1, List.of(
                new Node(3, List.of(
                        new Node(5),
                        new Node(6)
                )),
                new Node(2),
                new Node(4)
        ));

        var out = problem.postorder(root);

        assertEquals(6, out.size());
        assertEquals(List.of(5, 6, 3, 2, 4, 1), out);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
        Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
         */
        var root = new Node(1, List.of(
                new Node(2),
                new Node(3, List.of(
                        new Node(6),
                        new Node(7, List.of(
                                new Node(11, List.of(
                                        new Node(14)
                                ))
                        ))
                )),
                new Node(4, List.of(
                        new Node(8, List.of(
                                new Node(12)
                        ))
                )),
                new Node(5, List.of(
                        new Node(9, List.of(
                                new Node(13)
                        )),
                        new Node(10)
                ))
        ));

        var out = problem.postorder(root);

        assertEquals(14, out.size());
        assertEquals(List.of(2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1), out);
    }
}
