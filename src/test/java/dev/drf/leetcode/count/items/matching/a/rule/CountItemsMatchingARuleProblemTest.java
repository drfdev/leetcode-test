package dev.drf.leetcode.count.items.matching.a.rule;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountItemsMatchingARuleProblemTest {
    private final CountItemsMatchingARuleProblem problem = new CountItemsMatchingARuleProblem();

    @Test
    void example1() {
        // Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
        // ruleKey = "color", ruleValue = "silver"
        // Output: 1
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";

        var out = problem.countMatches(items, ruleKey, ruleValue);

        assertEquals(1, out);
    }

    @Test
    void example2() {
        // Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
        // ruleKey = "type", ruleValue = "phone"
        // Output: 2
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";

        var out = problem.countMatches(items, ruleKey, ruleValue);

        assertEquals(2, out);
    }
}
