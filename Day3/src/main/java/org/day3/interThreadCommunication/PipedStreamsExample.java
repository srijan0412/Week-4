package org.day3.interThreadCommunication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        String[] messages = {"Hello", "World", "This", "is", "Java", "Piped", "Streams"};
        try {
            for (String message : messages) {
                outputStream.write(message.getBytes());
                outputStream.write('\n'); // Write a newline character to separate messages
                outputStream.flush(); // Ensure data is sent immediately
                Thread.sleep(500); // Simulate some delay
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close(); // Close the output stream
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        byte[] buffer = new byte[1024];
        int bytesRead;
        try {
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                String message = new String(buffer, 0, bytesRead);
                System.out.print("Received: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close(); // Close the input stream
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PipedStreamsExample {
    public static void main(String[] args) {
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = null;

        try {
            inputStream = new PipedInputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        WriterThread writer = new WriterThread(outputStream);
        ReaderThread reader = new ReaderThread(inputStream);

        writer.start();
        reader.start();

        try {
            writer.join(); // Wait for the writer thread to finish
            reader.join(); // Wait for the reader thread to finish
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}