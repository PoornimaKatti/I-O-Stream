package com.InputOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;


public class InputStreamExample {
    public static void main(String[] args) {
        try {
            // Specify the absolute file path
            String filePath = "D:/PK/Java/JavaIOStreams/out/production/JavaIOStreams/com/InputOutputStream/input.txt";

            // Check if the file exists
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("File not found: " + filePath);
                return;
            }

            // Create an InputStream by opening a FileInputStream for the specified file
            InputStream input = new FileInputStream(file);

            // Read and print each byte from the InputStream
            int byteRead;
            while ((byteRead = input.read()) != -1) {
                System.out.print((char) byteRead); // Convert byte to char and print
            }

            // Close the InputStream
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

