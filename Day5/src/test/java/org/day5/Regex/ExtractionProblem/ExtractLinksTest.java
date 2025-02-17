package org.day5.Regex.ExtractionProblem;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.day5.Regex.ExtractionProblem.ExtractLinks;
import java.util.List;
public class ExtractLinksTest {
    @Test
    public void testExtractingEmails() {
        String sentence = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = ExtractEmails.extractData("https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[^\\s]*", sentence);
        assertEquals(2, links.size());
        assertTrue(links.contains("https://www.google.com"));
        assertTrue(links.contains("http://example.org"));
    }
}
