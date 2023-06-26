package dev.drf.leetcode.design.add.and.search.words.data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DesignAddAndSearchWordsDataStructureProblemTest {
    @Test
    void example() {
        /*
        Input
        ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
        [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
        Output
        [null,null,null,null,false,true,true,true]

        Explanation
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        wordDictionary.search("pad"); // return False
        wordDictionary.search("bad"); // return True
        wordDictionary.search(".ad"); // return True
        wordDictionary.search("b.."); // return True
         */
        var wordDictionary = new DesignAddAndSearchWordsDataStructureProblem.WordDictionary();

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        var res1 = wordDictionary.search("pad"); // return False
        var res2 = wordDictionary.search("bad"); // return True
        var res3 = wordDictionary.search(".ad"); // return True
        var res4 = wordDictionary.search("b.."); // return True

        assertFalse(res1);
        assertTrue(res2);
        assertTrue(res3);
        assertTrue(res4);
    }
}
