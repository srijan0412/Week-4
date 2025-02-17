package org.day5.Regex.AdvanceProblems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SSNValidatorTest {

    @Test
    public void testValidSSN() {
        String ssn = "123-45-6789";
        assertTrue(SSNValidator.isValidSSN(ssn));
    }

    @Test
    public void testInvalidSSNNoDashes() {
        String ssn = "123456789";
        assertFalse(SSNValidator.isValidSSN(ssn));
    }

    @Test
    public void testInvalidSSNIncorrectFormat() {
        String ssn = "123-45-67890";
        assertFalse(SSNValidator.isValidSSN(ssn));
    }

    @Test
    public void testInvalidSSNWithLetters() {
        String ssn = "123-45-ABCD";
        assertFalse(SSNValidator.isValidSSN(ssn));
    }
}
