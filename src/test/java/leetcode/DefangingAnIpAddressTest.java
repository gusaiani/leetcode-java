package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DefangingAnIpAddressTest {

    @Test
    void example1() {
        DefangingAnIpAddress solution = new DefangingAnIpAddress();
        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr("1.1.1.1"));
    }

    @Test
    void example2() {
        DefangingAnIpAddress solution = new DefangingAnIpAddress();
        assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr("255.100.50.0"));
    }

    @Test
    void allSameOctet() {
        DefangingAnIpAddress solution = new DefangingAnIpAddress();
        assertEquals("0[.]0[.]0[.]0", solution.defangIPaddr("0.0.0.0"));
    }

    @Test
    void mixedOctets() {
        DefangingAnIpAddress solution = new DefangingAnIpAddress();
        assertEquals("192[.]168[.]1[.]1", solution.defangIPaddr("192.168.1.1"));
    }
}
