package org.day5.Regex.ExtractionProblem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.day5.Regex.ExtractionProblem.ExtractCapitals;
import java.util.List;

public class ExtractCapitalsTest {
    @Test
    public void testExtractingCapitalsFromValidData() {
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = ExtractCapitals.extractData("[A-Z][a-zA-Z]+", sentence);
        assertEquals(8, words.size());
        assertTrue(words.contains("Tower"));
        assertTrue(words.contains("Paris"));
        assertTrue(words.contains("Statue"));
        assertTrue(words.contains("Liberty"));
        assertTrue(words.contains("New"));
        assertTrue(words.contains("York"));
    }

    @Test
    public void testExtractingCapitalsFromInvalidData() {
        String sentence = "this string has no capitals.";
        List<String> words = ExtractCapitals.extractData("[A-Z][a-zA-Z]+", sentence);
        assertTrue(words.isEmpty());
    }
}
