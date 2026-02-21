package dev.drf.leetcode.sorting.the.sentence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTheSentenceProblemTest {
    private final SortingTheSentenceProblem problem = new SortingTheSentenceProblem();

    @Test
    void example1() {
        // Input: s = "is2 sentence4 This1 a3"
        // Output: "This is a sentence"
        String s = "is2 sentence4 This1 a3";

        var sen = problem.sortSentence(s);

        assertEquals("This is a sentence", sen);
    }

    @Test
    void example2() {
        // Input: s = "Myself2 Me1 I4 and3"
        // Output: "Me Myself and I"
        String s = "Myself2 Me1 I4 and3";

        var sen = problem.sortSentence(s);

        assertEquals("Me Myself and I", sen);
    }

    @Test
    void failure1() {
        // s = "KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1"
        // "fi KTFkUVVrmYMSo wXlQraUqblfhCfDLK HlRjClVtQrTFcwbx NhpQ IfTuftYVualQ"
        String s = "KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1";

        var sen = problem.sortSentence(s);

        assertEquals("fi KTFkUVVrmYMSo wXlQraUqblfhCfDLK HlRjClVtQrTFcwbx NhpQ IfTuftYVualQ", sen);
    }
}
