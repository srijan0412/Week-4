package org.day3.consoleInput;

import java.io.*;

public class TakeInputFromConsole {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            FileWriter writer = new FileWriter("S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\consoleInput\\user_data.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            writer.close();

            System.out.println("Data saved to user_data.txt");
        } catch (IOException | NumberFormatException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


