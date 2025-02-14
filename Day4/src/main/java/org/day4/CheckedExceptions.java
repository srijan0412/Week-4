package org.day4;

import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            // Initializing the bufferedReader object
            BufferedReader br = new BufferedReader(new FileReader("sampleAddress.txt"));

            // Reading through all the lines in the file
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Closing the buffered Reader object
            br.close();
        }
        catch (IOException e) {
            System.out.println("File Not Found!");
        }
        System.out.println("IO Exception successfully handle");
    }
}
