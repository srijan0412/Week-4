package org.day5.Regex.ReplacementProblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReplaceSpaces {
    public  static String replace(String regex, String input, String replacement) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(replacement);
    }
    public static void main(String[] args) {
        // Regex pattern to match multiple spaces
        String regex = "\\s+";
        String testString = "This   is   a  test String.";

        // Output
        String result = replace(regex, testString, " ");
        System.out.println(result);
    }
}
