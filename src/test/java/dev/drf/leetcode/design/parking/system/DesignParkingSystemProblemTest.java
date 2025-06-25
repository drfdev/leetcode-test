package dev.drf.leetcode.design.parking.system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DesignParkingSystemProblemTest {
    @Test
    void example1() {
        // Input
        // ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
        // [[1, 1, 0], [1], [2], [3], [1]]
        // Output
        // [null, true, true, false, false]
        var parkingSystem = new DesignParkingSystemProblem.ParkingSystem(1, 1, 0);
        boolean res1 = parkingSystem.addCar(1); // return true because there is 1 available slot for a big car
        boolean res2 = parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car
        boolean res3 = parkingSystem.addCar(3); // return false because there is no available slot for a small car
        boolean res4 = parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.

        assertTrue(res1);
        assertTrue(res2);
        assertFalse(res3);
        assertFalse(res4);
    }
}
