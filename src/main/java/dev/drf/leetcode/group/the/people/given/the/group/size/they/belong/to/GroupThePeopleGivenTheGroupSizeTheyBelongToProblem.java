package dev.drf.leetcode.group.the.people.given.the.group.size.they.belong.to;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongToProblem implements Problem {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        final int size = groupSizes.length;
        var groupMap = new LinkedHashMap<Integer, List<Integer>>(size);

        for (int i = 0; i < size; i++) {
            int iGroupSize = groupSizes[i];
            final int index = i;
            groupMap.compute(iGroupSize, (key, values) -> {
                if (values == null) {
                    values = new ArrayList<>();
                }
                values.add(index);
                return values;
            });
        }

        var result = new ArrayList<List<Integer>>(groupMap.size());

        var keys = groupMap.keySet();
        for (Integer key : keys) {
            var values = groupMap.get(key);
            final int valuesSize = values.size();
            if (valuesSize > key) {
                int listCounts = valuesSize / key;
                for (int i = 0; i < listCounts; i++) {
                    final int startIndex = i * key;
                    final int endIndex = (i + 1) * key;
                    result.add(values.subList(startIndex, endIndex));
                }
            } else {
                result.add(values);
            }
        }

        return result;
    }
}
