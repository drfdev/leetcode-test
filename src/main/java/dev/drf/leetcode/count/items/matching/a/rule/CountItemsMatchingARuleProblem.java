package dev.drf.leetcode.count.items.matching.a.rule;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/count-items-matching-a-rule/
 */
public class CountItemsMatchingARuleProblem implements Problem {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sum = 0;
        final int index = detectIndex(ruleKey);

        for (List<String> item : items) {
            var value = item.get(index);
            if (ruleValue.equals(value)) {
                sum++;
            }
        }
        return sum;
    }

    private int detectIndex(String ruleKey) {
        return switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> throw new RuntimeException("Unknown ruleKey");
        };
    }
}
