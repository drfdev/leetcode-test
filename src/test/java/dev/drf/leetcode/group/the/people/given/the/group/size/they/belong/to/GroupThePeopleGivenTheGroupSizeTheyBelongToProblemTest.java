package dev.drf.leetcode.group.the.people.given.the.group.size.they.belong.to;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

public class GroupThePeopleGivenTheGroupSizeTheyBelongToProblemTest {
    private final GroupThePeopleGivenTheGroupSizeTheyBelongToProblem problem = new GroupThePeopleGivenTheGroupSizeTheyBelongToProblem();

    @Test
    void example1() {
        // Input: groupSizes = [3,3,3,3,3,1,3]
        // Output: [[5],[0,1,2],[3,4,6]]
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};

        var result = problem.groupThePeople(groupSizes);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo(5)
                ),
                containsInAnyOrder(
                        equalTo(0),
                        equalTo(1),
                        equalTo(2)
                ),
                containsInAnyOrder(
                        equalTo(3),
                        equalTo(4),
                        equalTo(6)
                )
        ));
    }

    @Test
    void example2() {
        // Input: groupSizes = [2,1,3,3,3,2]
        // Output: [[1],[0,5],[2,3,4]]
        int[] groupSizes = {2, 1, 3, 3, 3, 2};

        var result = problem.groupThePeople(groupSizes);

        assertThat(result, containsInAnyOrder(
                containsInAnyOrder(
                        equalTo(1)
                ),
                containsInAnyOrder(
                        equalTo(0),
                        equalTo(5)
                ),
                containsInAnyOrder(
                        equalTo(2),
                        equalTo(3),
                        equalTo(4)
                )
        ));
    }
}
