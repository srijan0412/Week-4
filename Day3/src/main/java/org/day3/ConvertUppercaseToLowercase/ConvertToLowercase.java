package org.day3.ConvertUppercaseToLowercase;

import java.io.*;

public class ConvertToLowercase {
    public static void main(String[] args) {
        String inputFile = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\ConvertUppercaseToLowercase\\input.txt";
        String outputFile = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\ConvertUppercaseToLowercase\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion completed successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

