package org.day5.basicRegexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicencePlateNumber {
    // Method to validate a testString
    public static Boolean validate(String regex, String testString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$"; // Regex to validate a number plate
        String inputs[] = {"AB1234", "A12345"}; // Array of test inputs 
        for (String input : inputs) {
            if (validate(regex, input)) {
                System.out.println(input + " is Valid.");
            }
            else {
                System.out.println(input + " is Invalid.");
            }
        }
    }
}
