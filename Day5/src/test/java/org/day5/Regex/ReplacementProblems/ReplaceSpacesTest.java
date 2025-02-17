package org.day5.Regex.ReplacementProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.day5.Regex.ReplacementProblem.CensorBadWords;
import org.day5.Regex.ReplacementProblem.ReplaceSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceSpacesTest {
    @Test
    public void testReplaceExtraSpaces() {
        String regex = "\\s+";
        String testString = "This    is an       example  of  string    with      extra spaces.";
        String expected = "This is an example of string with extra spaces.";
        testString = ReplaceSpaces.replace(regex, testString, " ");
        Assertions.assertEquals(expected, testString);
    }

    @Test
    public void testReplaceSpaceInAValidString() {
        String regex = "\\s+";
        String testString = "This string has no extra space.";
        String expected = "This string has no extra space.";
        testString = ReplaceSpaces.replace(regex, testString, " ");
        Assertions.assertEquals(expected, testString);
    }
}
