package dev.drf.leetcode.number.of.provinces;

import dev.drf.leetcode.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/number-of-provinces/
 */
public class NumberOfProvincesProblem implements Problem {
    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null) {
            return 0;
        }
        if (isConnected.length == 1) {
            return 1;
        }

        final int cities = isConnected.length;
        Set<Integer> freeCities = new HashSet<>(cities);
        for (int i = 0; i < cities; i++) {
            freeCities.add(i);
        }

        int provinces = 0;
        while (!freeCities.isEmpty()) {
            int nextCity = freeCities.stream().findFirst().get();
            provinces++;

            freeCities.remove(nextCity);
            removeProvinceCity(isConnected, nextCity, freeCities);
        }

        return provinces;
    }

    private void removeProvinceCity(int[][] isConnected, int nextCity, Set<Integer> freeCities) {
        int[] connections = isConnected[nextCity];

        for (int i = 0; i < connections.length; i++) {
            if (connections[i] == 1 && freeCities.contains(i)) {
                freeCities.remove(nextCity);
                removeProvinceCity(isConnected, i, freeCities);
            }
        }
    }
}
