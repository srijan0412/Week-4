package org.day5.Regex.ExtractionProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
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
        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";

        // Defining the test String
        String testString = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        List<String> result = extractData(regex, testString);
        for (String element : result) {
            System.out.println(element);
        }
    }
}
