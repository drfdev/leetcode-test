package dev.drf.leetcode.crawler.log.folder;

import dev.drf.leetcode.Problem;

import java.util.Objects;

/**
 * https://leetcode.com/problems/crawler-log-folder/
 */
public class CrawlerLogFolderProblem implements Problem {
    private static final String MOVE_UP_FOLDER = "../";
    private static final String CURRENT_FOLDER = "./";

    public int minOperations(String[] logs) {
        int count = 0;

        for (String log : logs) {
            if (Objects.equals(log, MOVE_UP_FOLDER)) {
                count--;
                if (count < 0) {
                    count = 0;
                }
            } else if (Objects.equals(log, CURRENT_FOLDER)) {
                // do nothing
            } else {
                count++;
            }
        }

        return count;
    }
}
