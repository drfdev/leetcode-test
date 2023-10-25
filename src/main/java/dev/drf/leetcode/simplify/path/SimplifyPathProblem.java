package dev.drf.leetcode.simplify.path;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/simplify-path/
 * Used solution:
 * https://leetcode.com/problems/simplify-path/solutions/25686/java-10-lines-solution-with-stack/?envType=study-plan-v2&envId=top-interview-150
 */
public class SimplifyPathProblem implements Problem {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(List.of("..", ".", ""));

        String[] paths = path.split("/");
        for (String dir : paths) {
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!skip.contains(dir)) {
                stack.push(dir);
            }
        }

        StringBuilder res = new StringBuilder();
        for (String dir : stack) {
            res.insert(0, "/" + dir);
        }

        return res.isEmpty() ? "/" : res.toString();
    }
}
