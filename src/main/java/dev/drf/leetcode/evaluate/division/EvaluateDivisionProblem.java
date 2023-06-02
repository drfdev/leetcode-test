package dev.drf.leetcode.evaluate.division;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/evaluate-division/
 */
public class EvaluateDivisionProblem implements Problem {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<DestinyValue>> equationMap = new HashMap<>(2 * equations.size());

        for (int i = 0; i < equations.size(); i++) {
            List<String> eq = equations.get(i);
            double value = values[i];

            String left = eq.get(0);
            String right = eq.get(1);

            List<DestinyValue> leftDestinyValues = equationMap.get(left);
            if (leftDestinyValues == null) {
                leftDestinyValues = new ArrayList<>();
                equationMap.put(left, leftDestinyValues);
            }
            leftDestinyValues.add(new DestinyValue(right, value));

            List<DestinyValue> rightDestinyValues = equationMap.get(right);
            if (rightDestinyValues == null) {
                rightDestinyValues = new ArrayList<>();
                equationMap.put(right, rightDestinyValues);
            }
            rightDestinyValues.add(new DestinyValue(left, 1 / value));
        }

        double[] result = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);

            String from = query.get(0);
            String to = query.get(1);

            if (Objects.equals(from, to)
                    && equationMap.containsKey(from)) {
                result[i] = 1;
            } else {
                result[i] = calculate(new HashSet<String>(), from, to, equationMap, 0d, false);
            }
        }

        return result;
    }

    private double calculate(HashSet<String> strings,
                             String from,
                             String to,
                             Map<String, List<DestinyValue>> equationMap,
                             double collectedValue,
                             boolean bool) {
        List<DestinyValue> values = equationMap.get(from);
        if (values == null) {
            return -1;
        }
        for (DestinyValue value : values) {
            String equation = value.equation;
            if (!strings.contains(equation)) {
                // could be a loop here
                strings.add(equation);

                double dValue = value.value;

                double nextResult = bool
                        ? collectedValue * dValue
                        : dValue;

                if (equation.equals(to)) {
                    return nextResult;
                }

                double result = calculate(strings, equation, to, equationMap, nextResult, true);
                if (result != -1) {
                    return result;
                }
            }
        }
        return -1;
    }

    private static class DestinyValue {
        private final String equation;
        private final double value;

        public DestinyValue(String equation, double value) {
            this.equation = equation;
            this.value = value;
        }
    }
}
