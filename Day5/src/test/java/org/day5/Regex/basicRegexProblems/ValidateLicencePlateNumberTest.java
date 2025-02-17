package org.day5.Regex.basicRegexProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.day5.Regex.basicRegexProblems.ValidateLicencePlateNumber;

public class ValidateLicencePlateNumberTest {
    @Test
    public void testValidLicencePlate() {
        assertTrue(ValidateLicencePlateNumber.validate("^[A-Z]{2}[0-9]{4}$", "AB1234"));
    }
    @Test
    public void testInvalidLicencePlate() {
        assertFalse(ValidateLicencePlateNumber.validate("^[A-Z]{2}[0-9]{4}$", "A12345"));
    }
}
