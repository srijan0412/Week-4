package org.day5.Regex.AdvanceProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IPAddressValidatorTest {
    @Test
    public void testValidIP() {
        assertTrue(IPAddressValidator.isValidIP("192.168.1.1"));
    }
    @Test
    public void testInvalidIP() {
        assertFalse(IPAddressValidator.isValidIP("256.256.256.256"));
    }
    @Test
    public void testInvalidIPTooFewOctets() {
        assertFalse(IPAddressValidator.isValidIP("192.168.1"));
    }
    @Test
    public void testInvalidIPTooManyOctets() {
        assertFalse(IPAddressValidator.isValidIP("192.168.1.1.1"));
    }
}
