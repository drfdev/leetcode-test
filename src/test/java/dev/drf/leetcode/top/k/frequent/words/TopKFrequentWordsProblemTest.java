package dev.drf.leetcode.top.k.frequent.words;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class TopKFrequentWordsProblemTest {
    private final TopKFrequentWordsProblem problem = new TopKFrequentWordsProblem();

    @Test
    void example1() {
        /*
        Input: words = ["i","love","leetcode","i","love","coding"], k = 2
        Output: ["i","love"]
        Explanation: "i" and "love" are the two most frequent words.
        Note that "i" comes before "love" due to a lower alphabetical order.
         */
        String[] words = new String[]{
                "i", "love", "leetcode", "i", "love", "coding"
        };
        int k = 2;

        var result = problem.topKFrequent(words, k);

        assertThat(result, contains(
                equalTo("i"),
                equalTo("love")
        ));
    }

    @Test
    void example2() {
        /*
        Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
        Output: ["the","is","sunny","day"]
        Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
        with the number of occurrence being 4, 3, 2 and 1 respectively.
         */
        String[] words = new String[]{
                "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"
        };
        int k = 4;

        var result = problem.topKFrequent(words, k);

        assertThat(result, contains(
                equalTo("the"),
                equalTo("is"),
                equalTo("sunny"),
                equalTo("day")
        ));
    }
}
