package com.ss.day3.countchar;

import java.io.*;
import java.util.Scanner;

/**
 * author Arun Mavumkal
 */
public class CountChar {

    /**
     * @param text - Text to be searched
     * @param searchTerm - Char value to search for must be defined. not null;
     * @return - returns integer with count of nunber of occurances.
     */
    public static int countE(String text, String searchTerm) {
        int result = 0;
        if(text == null)
            return result;
        for(int i = 0; i < text.length(); ++i) {
            char chr = text.charAt(i);
            if(chr == searchTerm.charAt(0)) {
                ++result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchChar = "";
        int searchCount = 0;
        if (args.length == 0) {
            System.out.println("Error: Usage must pass path to file you want to search");
            return;
        } else if(args.length > 1) {
            System.out.println("Error: program only takes one argument. Name of file to search");
            return;
        }
        while(searchChar.length() != 1) {
            System.out.println("Enter char to search");
            searchChar = scanner.nextLine();
            if(searchChar.length() != 1) {
                System.out.println("Invalid Entry must enter a single character only");
            }
        }
        try(
                BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ) {
            String fileLine = reader.readLine();
            System.out.println("File Contents: ");
            while(fileLine != null) {
                System.out.println(fileLine);
                searchCount += countE(fileLine, searchChar);
                fileLine = reader.readLine();

            }
            System.out.println("Number of time " + searchChar + " is repeated: " + searchCount);

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
