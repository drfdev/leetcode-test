package dev.drf.leetcode.search.suggestions.system;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SearchSuggestionsSystemProblemTest {
    private final SearchSuggestionsSystemProblem problem = new SearchSuggestionsSystemProblem();

    @Test
    void example1() {
        /*
        Input: products = ["mobile","mouse","moneypot","monitor","mousepad"],
            searchWord = "mouse"
        Output: [["mobile","moneypot","monitor"],
            ["mobile","moneypot","monitor"],
            ["mouse","mousepad"],
            ["mouse","mousepad"],
            ["mouse","mousepad"]
         ]
         */
        String[] products = new String[]{
                "mobile", "mouse", "moneypot", "monitor", "mousepad"
        };
        String searchWord = "mouse";

        var result = problem.suggestedProducts(products, searchWord);

        System.out.println(result);
        assertThat(result, containsInAnyOrder(
                containsInAnyOrder("mobile", "moneypot", "monitor"),
                containsInAnyOrder("mobile", "moneypot", "monitor"),
                containsInAnyOrder("mouse", "mousepad"),
                containsInAnyOrder("mouse", "mousepad"),
                containsInAnyOrder("mouse", "mousepad")
        ));
    }

    @Test
    void example2() {
        /*
        Input: products = ["havana"],
            searchWord = "havana"
        Output: [["havana"],
            ["havana"],
            ["havana"],
            ["havana"],
            ["havana"],
            ["havana"]
        ]
         */
        String[] products = new String[]{
                "havana"
        };
        String searchWord = "havana";

        var result = problem.suggestedProducts(products, searchWord);

        System.out.println(result);
        assertThat(result, containsInAnyOrder(
                containsInAnyOrder("havana"),
                containsInAnyOrder("havana"),
                containsInAnyOrder("havana"),
                containsInAnyOrder("havana"),
                containsInAnyOrder("havana"),
                containsInAnyOrder("havana")
        ));
    }
}
