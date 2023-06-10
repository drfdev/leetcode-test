package dev.drf.leetcode.implement.trie.prefix.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImplementTriePrefixTreeProblemTest {
//    private final ImplementTriePrefixTreeProblem problem = new ImplementTriePrefixTreeProblem();

    @Test
    void example1() {
        /*
        Input
        ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
        [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
        Output
        [null, null, true, false, true, null, true]

        Explanation
        Trie trie = new Trie();
        trie.insert("apple");
        trie.search("apple");   // return True
        trie.search("app");     // return False
        trie.startsWith("app"); // return True
        trie.insert("app");
        trie.search("app");     // return True
         */
        var trie = new ImplementTriePrefixTreeProblem.Trie();

        trie.insert("apple");
        var res1 = trie.search("apple");   // return True
        var res2 = trie.search("app");     // return False
        var res3 = trie.startsWith("app"); // return True
        trie.insert("app");
        var res4 = trie.search("app");     // return True

        assertTrue(res1);
        assertFalse(res2);
        assertTrue(res3);
        assertTrue(res4);
    }
}
