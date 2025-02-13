package org.day3.imageToByteArray;

import java.io.*;
import java.nio.file.Files;

public class ByteArrayImageConversion {
    public static void main(String[] args) {
        String inputImagePath = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\imageToByteArray\\input.jpg";
        String outputImagePath = "S:\\Capgemini\\Week-4\\Day3\\src\\main\\java\\org\\day3\\imageToByteArray\\output.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            // Write byte array back to image
            writeByteArrayToImage(imageBytes, outputImagePath);

            // Verify if the images are identical
            if (Files.mismatch(new File(inputImagePath).toPath(), new File(outputImagePath).toPath()) == -1) {
                System.out.println("The original and output images are identical.");
            } else {
                System.out.println("The images are different.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}

