package org.day5.basicRegexProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
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
        String regex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[^\\s]*";

        // Defining the test String
        String testString = "Visit https://www.google.com and http://example.org for more info.";

        List<String> result = extractData(regex, testString);
        for (String element : result) {
            System.out.println(element);
        }
    }
}
