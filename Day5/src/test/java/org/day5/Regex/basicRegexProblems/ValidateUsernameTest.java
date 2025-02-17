package org.day5.Regex.basicRegexProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.day5.Regex.basicRegexProblems.ValidateUsername;

public class ValidateUsernameTest {
    @Test
    public void testValidUsername() {
        assertTrue(ValidateUsername.validate("^[a-zA-Z][a-zA-Z0-9_]{4,14}$", "user_123"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(ValidateUsername.validate("^[a-zA-Z][a-zA-Z0-9_]{4,14}$", "123user"));
    }

    @Test
    public void testTooShortUsername() {
        assertFalse(ValidateUsername.validate("^[a-zA-Z][a-zA-Z0-9_]{4,14}$","us"));
    }
    @Test
    public void testTooLongUsername() {
        assertFalse(ValidateUsername.validate("^[a-zA-Z][a-zA-Z0-9_]{4,14}$", "this_username_is_too_long"));
    }
    @Test
    public void testEmptyUsername() {
        assertFalse(ValidateUsername.validate("^[a-zA-Z][a-zA-Z0-9_]{4,14}$", ""));
    }

    @Test
    public void testUsernameWithSpecialCharacters() {
        assertFalse(ValidateUsername.validate("^[a-zA-Z][a-zA-Z0-9_]{4,14}$", "user@123"));
    }

    @Test
    public void testUsernameWithOnlyNumbers() {
        assertFalse(ValidateUsername.validate("^[a-zA-Z][a-zA-Z0-9_]{4,14}$", "123456"));
    }
}
