package com.BufferedExample;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class InputDemo {


        public static void main(String args[]) {

            try {

                // Suppose, the input.txt file contains the following text
                // This is a line of text inside the file.
                FileInputStream file = new FileInputStream("D:\\PK\\Java\\JavaIOStreams\\out\\production\\JavaIOStreams\\com\\BufferedExample\\input.txt");

                // Creates a BufferedInputStream
                BufferedInputStream buffer = new BufferedInputStream(file);

                // Returns the available number of bytes
                System.out.println("Available bytes at the beginning: " + buffer.available());

                // Reads bytes from the file
                buffer.read();
                buffer.read();
                buffer.read();

                // Returns the available number of bytes
                System.out.println("Available bytes at the end: " + buffer.available());

                buffer.close();
            }

            catch (Exception e) {
                System.out.println(e);
                e.getStackTrace();
            }
        }
    }


