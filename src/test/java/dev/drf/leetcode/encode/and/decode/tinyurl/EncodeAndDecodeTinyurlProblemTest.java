package dev.drf.leetcode.encode.and.decode.tinyurl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeAndDecodeTinyurlProblemTest {
    @Test
    void example1() {
        /*
        Input: url = "https://leetcode.com/problems/design-tinyurl"
        Output: "https://leetcode.com/problems/design-tinyurl"

        Explanation:
        Solution obj = new Solution();
        string tiny = obj.encode(url); // returns the encoded tiny url.
        string ans = obj.decode(tiny); // returns the original url after decoding it.
         */
        var url = "https://leetcode.com/problems/design-tinyurl";
        var obj = new EncodeAndDecodeTinyurlProblem.Codec();
        var tiny = obj.encode(url);
        var ans = obj.decode(tiny);

        assertEquals(url, ans);
    }
}
