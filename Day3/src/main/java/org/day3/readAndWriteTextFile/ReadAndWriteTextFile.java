package org.day3.readAndWriteTextFile;

import java.io.*;

public class ReadAndWriteTextFile {
    public static void main(String[] args) {
        String sourceFile = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\readAndWriteTextFile\\source.txt";
        String destinationFile = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\readAndWriteTextFile\\destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error while reading/writing file: " + e.getMessage());
        }
    }
}

