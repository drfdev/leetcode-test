package dev.drf.leetcode.count.and.say;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-and-say/
 */
public class CountAndSayProblem implements Problem {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String res = "1";
        for (int i = 1; i < n; i++) {
            res = countAndSayStr(res);
        }

        return res;
    }

    private String countAndSayStr(String str) {
        char[] chars = str.toCharArray();
        final int len = chars.length;

        StringBuilder sb = new StringBuilder();
        char ch = chars[0];
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            char value = chars[i];
            if (ch == value) {
                cnt++;
            } else {
                sb.append(cnt)
                        .append(ch);
                ch = value;
                cnt = 1;
            }
        }

        if (cnt > 0) {
            sb.append(cnt)
                    .append(ch);
        }

        return sb.toString();
    }
}
