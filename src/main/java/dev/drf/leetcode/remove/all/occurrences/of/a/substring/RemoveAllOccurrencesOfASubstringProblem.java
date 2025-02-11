package dev.drf.leetcode.remove.all.occurrences.of.a.substring;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */
public class RemoveAllOccurrencesOfASubstringProblem implements Problem {
    public String removeOccurrences(String s, String part) {
        final int partLength = part.length();
        final char[] partChars = part.toCharArray();
        var ss = new StringStack(s);

        int index = ss.find(partChars);
        while (index > -1) {
            ss.remove(index, partLength);
            index = ss.find(partChars);
        }

        return ss.getValue();
    }

    private static class StringStack {
        private final char[] stack;
        private int count;

        public StringStack(String str) {
            this.stack = str.toCharArray();
            this.count = this.stack.length;
        }

        public String getValue() {
            return String.valueOf(this.stack, 0, count);
        }

        public int find(char[] part) {
            final int partLength = part.length;
            if (count < partLength) {
                return -1;
            }

            for (int i = 0; i < this.count; i++) {
                if (this.stack[i] == part[0]) {
                    boolean correct = true;
                    for (int j = 1; j < partLength; j++) {
                        if (!(i + j < this.count
                                && this.stack[i + j] == part[j])) {
                            correct = false;
                            break;
                        }
                    }
                    if (correct) {
                        return i;
                    }
                }
            }

            return -1;
        }

        public void remove(int index, int length) {
            System.arraycopy(this.stack, index + length,
                    this.stack, index,
                    this.count - length - index);
            this.count = this.count - length;
        }
    }
}
