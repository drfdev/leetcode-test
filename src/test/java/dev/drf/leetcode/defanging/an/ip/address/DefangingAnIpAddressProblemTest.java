package dev.drf.leetcode.defanging.an.ip.address;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefangingAnIpAddressProblemTest {
    private final DefangingAnIpAddressProblem problem = new DefangingAnIpAddressProblem();

    @Test
    void example1() {
        /*
        Input: address = "1.1.1.1"
        Output: "1[.]1[.]1[.]1"
         */
        var address = "1.1.1.1";

        var res = problem.defangIPaddr(address);

        assertEquals("1[.]1[.]1[.]1", res);
    }

    @Test
    void example2() {
        /*
        Input: address = "255.100.50.0"
        Output: "255[.]100[.]50[.]0"
         */
        var address = "255.100.50.0";

        var res = problem.defangIPaddr(address);

        assertEquals("255[.]100[.]50[.]0", res);
    }
}
