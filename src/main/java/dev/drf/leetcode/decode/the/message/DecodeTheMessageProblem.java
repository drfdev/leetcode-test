package dev.drf.leetcode.decode.the.message;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/decode-the-message/
 */
public class DecodeTheMessageProblem implements Problem {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> keyMap = new HashMap<>(26);

        char[] keyChars = key.toCharArray();
        char ch = 'a';
        for (char keyChar : keyChars) {
            if (keyChar != ' '
                    && !keyMap.containsKey(keyChar)) {
                keyMap.put(keyChar, ch);
                ch++;
            }
        }

        char[] messageChars = message.toCharArray();
        for (int i = 0; i < messageChars.length; i++) {
            char mChar = messageChars[i];

            if (mChar != ' '
                    && keyMap.containsKey(mChar)) {
                char swapChar = keyMap.get(mChar);
                messageChars[i] = swapChar;
            }
        }

        return new String(messageChars);
    }
}
