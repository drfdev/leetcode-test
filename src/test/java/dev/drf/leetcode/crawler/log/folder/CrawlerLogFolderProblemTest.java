package dev.drf.leetcode.crawler.log.folder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrawlerLogFolderProblemTest {
    private final CrawlerLogFolderProblem problem = new CrawlerLogFolderProblem();

    @Test
    void example1() {
        /*
        Input: logs = ["d1/","d2/","../","d21/","./"]
        Output: 2
         */
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};

        var out = problem.minOperations(logs);

        assertEquals(2, out);
    }

    @Test
    void example2() {
        /*
        Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
        Output: 3
         */
        String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};

        var out = problem.minOperations(logs);

        assertEquals(3, out);
    }
}
