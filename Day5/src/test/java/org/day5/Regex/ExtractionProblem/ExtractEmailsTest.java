package org.day5.Regex.ExtractionProblem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExtractEmailsTest {
    @Test
    public void testExtractingEmails() {
        String sentence = "Contact us at support@example.com and info@company.org";
        List<String> emails = ExtractEmails.extractData("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", sentence);
        assertEquals(2, emails.size());
        assertTrue(emails.contains("support@example.com"));
        assertTrue(emails.contains("info@company.org"));
    }
}
