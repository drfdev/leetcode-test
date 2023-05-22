package dev.drf.leetcode.dota2.senate;

import dev.drf.leetcode.Problem;

import java.util.LinkedList;
import java.util.Objects;

/**
 * https://leetcode.com/problems/dota2-senate/
 */
@Deprecated
public class Dota2SenateProblem implements Problem {
    private static final String RADIANT = "Radiant";
    private static final String DIRE = "Dire";

    public String predictPartyVictory(String senate) {
        if (senate == null) {
            return null;
        }

        int size = senate.length();
        LinkedList<Senator> senatorList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            char sen = senate.charAt(i);
            Senator newSenator;
            if (sen == 'D') {
                newSenator = Senator.dire();
            } else {
                newSenator = Senator.radiant();
            }
            Senator last = senatorList.peekLast();
            if (last != null
                    && !Objects.equals(last.type, newSenator.type)
                    && last.hasBan) {
                last.hasBan = false;
            } else {
                senatorList.add(newSenator);
            }
        }

        Senator last = senatorList.peekLast();
        if (last == null) {
            return null;
        }
        return last.type;
    }

    private static class Senator {
        private final String type;
        private boolean hasBan = true;

        public Senator(String type) {
            this.type = type;
        }

        public static Senator dire() {
            return new Senator(DIRE);
        }

        public static Senator radiant() {
            return new Senator(RADIANT);
        }
    }
}
