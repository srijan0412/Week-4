package org.day5.Regex.ReplacementProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.day5.Regex.ReplacementProblem.CensorBadWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CensorBadWordsTest {
    @Test
    public void testCensorBadWords() {
        String badWords[] = {"damn", "stupid"};
        String testString = "This is a damn bad example with some stupid words.";
        String expected = "This is a **** bad example with some **** words.";
        for (String badWord : badWords) {
            testString = CensorBadWords.replace(badWord, testString, "****");
        }
        Assertions.assertEquals(expected, testString);
    }
    @Test
    public void testCensorBadWordsInNormalData() {
        String badWords[] = {"damn", "stupid"};
        String testString = "This string has no bad words.";
        String expected = "This string has no bad words.";
        for (String badWord : badWords) {
            testString = CensorBadWords.replace(badWord, testString, "****");
        }
        Assertions.assertEquals(expected, testString);
    }
}
