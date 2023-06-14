package dev.drf.leetcode.time.based.key.value.store;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.com/problems/time-based-key-value-store/
 * Time Limit Exceeded
 */
@Deprecated
public class TimeBasedKeyValueStoreProblem implements Problem {
    public static class TimeMap {
        private HashMap<String, List<TimestampValue>> map = new HashMap<>();

        public TimeMap() {
            // noOp
        }

        public void set(String key, String value, int timestamp) {
            List<TimestampValue> values = map.get(key);
            if (values == null) {
                values = new ArrayList<>();
                map.put(key, values);
            }

            values.add(TimestampValue.of(timestamp, value));
            values.sort(TimestampValue::compareTo);
        }

        public String get(String key, int timestamp) {
            List<TimestampValue> values = map.get(key);
            if (values == null || values.size() == 0) {
                return "";
            }
            if (values.size() == 1) {
                TimestampValue val = values.get(0);
                return val.timestamp <= timestamp ? val.value : "";
            }

            int left = 0;
            int right = values.size() - 1;
            TimestampValue val = null;

            while (left <= right) {
                int middle = (right + left) / 2;
                val = values.get(middle);

                if (val.timestamp > timestamp) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            val = right < 0 ? null : values.get(right);
            return val == null ? "" : val.value;
        }

        private static class TimestampValue implements Comparable<TimestampValue> {
            private final int timestamp;
            private final String value;

            public TimestampValue(int timestamp, String value) {
                this.timestamp = timestamp;
                this.value = value;
            }

            public static TimestampValue of(int timestamp, String value) {
                return new TimestampValue(timestamp, value);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                TimestampValue that = (TimestampValue) o;
                return timestamp == that.timestamp
                        && Objects.equals(value, that.value);
            }

            @Override
            public int hashCode() {
                return Objects.hash(timestamp, value);
            }

            @Override
            public int compareTo(TimestampValue o) {
                return Integer.compare(this.timestamp, o.timestamp);
            }
        }
    }
}
