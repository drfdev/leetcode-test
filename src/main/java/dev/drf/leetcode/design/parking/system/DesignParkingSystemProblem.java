package dev.drf.leetcode.design.parking.system;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/design-parking-system/
 */
public class DesignParkingSystemProblem implements Problem {
    public static class ParkingSystem {
        private final int bigMax;
        private final int mediumMax;
        private final int smallMax;

        private int bigCurrent = 0;
        private int mediumCurrent = 0;
        private int smallCurrent = 0;

        public ParkingSystem(int big, int medium, int small) {
            this.bigMax = big;
            this.mediumMax = medium;
            this.smallMax = small;
        }

        public boolean addCar(int carType) {
            // big, medium, or small, which are represented by 1, 2, and 3 respectively
            if (carType == 1) {
                if (bigCurrent < bigMax) {
                    bigCurrent++;
                    return true;
                }
                return false;
            }
            if (carType == 2) {
                if (mediumCurrent < mediumMax) {
                    mediumCurrent++;
                    return true;
                }
                return false;
            }
            if (carType == 3) {
                if (smallCurrent < smallMax) {
                    smallCurrent++;
                    return true;
                }
                return false;
            }

            return false;
        }
    }
}
