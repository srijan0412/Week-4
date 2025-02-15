package org.day4;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        // Reading a file and handling IO Exception
        try {
            // BufferReader for taking input
            BufferedReader br = new BufferedReader(new FileReader("S:\\Capgemini\\Week-4\\Day4\\src\\main\\java\\org\\day4\\info.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Closing the BufferedReader class object
            br.close();
        }
        catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
