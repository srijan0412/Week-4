package org.day5.Regex.ExtractionProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitals {
    // Method to extract all the valid data
    public static List<String> extractData(String regex, String testString) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);

        while (matcher.find()) { // Searching the testString
            result.add(matcher.group());
        }

        return result;
    }
    public static void main(String[] args) {
        // Defining the regix to extract the data
        String regex = "[A-Z][a-zA-Z]+";

        // Defining the test String
        String testString = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        List<String> result = extractData(regex, testString);
        for (String element : result) {
            System.out.println(element);
        }
    }
}
