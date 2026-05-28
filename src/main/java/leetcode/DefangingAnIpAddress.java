package leetcode;

/**
 * LeetCode 1108. Defanging an IP Address https://leetcode.com/problems/defanging-an-ip-address/
 *
 * <p>Given a valid (IPv4) IP address, return a defanged version of that IP address. A defanged IP
 * address replaces every period "." with "[.]".
 */
public class DefangingAnIpAddress {

    public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }
}
