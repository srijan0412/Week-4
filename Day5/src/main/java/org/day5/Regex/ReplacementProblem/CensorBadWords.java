package org.day5.Regex.ReplacementProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadWords {
    public  static String replace(String regex, String input, String replacement) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(replacement);
    }
    public static void main(String[] args) {
        // Array of bad words
        String badWords[] = {"damn", "stupid"};

        // Regex pattern to match multiple spaces
        String testString = "This is a damn bad example with some stupid words.";

        // Censsor Bad Words
        for (String badWord : badWords) {
            testString = replace(badWord, testString, "****");
        }

        // Output
        System.out.println(testString);
    }
}
