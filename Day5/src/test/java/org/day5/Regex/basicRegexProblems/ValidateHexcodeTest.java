package org.day5.Regex.basicRegexProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.day5.Regex.basicRegexProblems.ValidateHexcode;

public class ValidateHexcodeTest {
    @Test
    public void testValidHexcode() {
        assertTrue(ValidateHexcode.validate("^#[a-zA-Z0-9]{6}$", "#FFA500"));
    }
    @Test
    public void testInvalidHexcode() {
        assertFalse(ValidateHexcode.validate("^#[a-zA-Z0-9]{6}$", "#123"));
    }
}
