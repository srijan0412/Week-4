package org.day5.Regex.basicRegexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexcode {
    // Method to validate a testString
    public static Boolean validate(String regex, String testString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String regex = "^#[a-zA-Z0-9]{6}$"; // Regex to validate a Hexcode
        String inputs[] = {"#FFA500", "#ff4500", "#123"}; // Array of test inputs
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
