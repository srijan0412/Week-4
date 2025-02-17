package org.day5.Regex.basicRegexProblems;

import java.util.regex.*;

public class ValidateUsername {
    public static Boolean validate(String regex, String testString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String inputs[] = {"user_123", "123user", "us"};
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        for (String input : inputs) {
            if (validate(regex, input)) {
                System.out.println(input + " - Valid");
            }
            else {
                System.out.println(input + " - In-valid");
            }
        }
    }
}
