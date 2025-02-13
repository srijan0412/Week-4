package org.day3.efficientFileCopy;

import java.io.*;

public class EfficientFileCopy {
    private static long copyFileBuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }

    private static long copyFileUnbuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }
    public static void main(String[] args) {
        String sourceFile = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\efficientFileCopy\\source.txt"; // Replace with actual file path
        String destBuffered = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\efficientFileCopy\\copy_buffered.txt";
        String destUnbuffered = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\efficientFileCopy\\copy_unbuffered.txt";

        // Copy using Buffered Streams
        long bufferedTime = copyFileBuffered(sourceFile, destBuffered);
        System.out.println("Buffered Stream Time: " + bufferedTime + " ns");

        // Copy using Unbuffered Streams
        long unbufferedTime = copyFileUnbuffered(sourceFile, destUnbuffered);
        System.out.println("Unbuffered Stream Time: " + unbufferedTime + " ns");
    }
}


