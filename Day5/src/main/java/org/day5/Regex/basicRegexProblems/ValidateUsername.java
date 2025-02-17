package org.day5.Regex.basicRegexProblems;

import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {
        String inputs[] = {"user_123", "123user", "us"};
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        Pattern pattern = Pattern.compile(regex);
        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println(input + " - Valid");
            }
            else {
                System.out.println(input + " - In-valid");
            }
        }
    }
}
