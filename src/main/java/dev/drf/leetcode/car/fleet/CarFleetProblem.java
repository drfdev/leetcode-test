package dev.drf.leetcode.car.fleet;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/car-fleet/
 */
public class CarFleetProblem implements Problem {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1) {
            return 1;
        }

        int size = position.length;

        Car[] cars = new Car[size];

        for (int i = 0; i < size; i++) {
            int pos = position[i];
            int spd = speed[i];

            Car car = new Car();
            car.position = pos;
            car.time = ((double) target - pos) / spd;
            cars[i] = car;
        }

        Arrays.sort(cars, Comparator.comparingInt(it -> it.position));

        int count = 0;
        double lastTime = 0;

        for (int i = size - 1; i >= 0; i--) {
            Car item = cars[i];
            if (item.time > lastTime) {
                lastTime = item.time;
                count++;
            }
        }

        return count;
    }

    private static class Car {
        private int position;
        private double time;
    }
}
