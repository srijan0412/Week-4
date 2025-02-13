package org.day3.readALargeFile;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\readALargeFile\\largefile.txt"; // Replace with your file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

