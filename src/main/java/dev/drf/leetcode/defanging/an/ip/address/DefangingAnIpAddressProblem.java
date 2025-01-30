package dev.drf.leetcode.defanging.an.ip.address;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public class DefangingAnIpAddressProblem implements Problem {
    public String defangIPaddr(String address) {
        if (address == null) {
            return null;
        }
        var chars = address.toCharArray();
        var sb = new StringBuilder();

        for (char ch : chars) {
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
