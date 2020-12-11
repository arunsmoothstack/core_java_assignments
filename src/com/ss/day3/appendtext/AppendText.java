package com.ss.day3.appendtext;

import java.io.*;
import java.util.Scanner;

public class AppendText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (args.length == 0) {
            System.out.println("Error: Usage must pass path to file you want to edit as command line argument");
            return;
        } else if(args.length > 1) {
            System.out.println("Error: program only takes one argument. Name of file to edit");
            return;
        }

        try(
                BufferedReader reader = new BufferedReader(new FileReader(args[0]));
                FileWriter fileWriter = new FileWriter(new File(args[0]), true);
                BufferedWriter BufWriter = new BufferedWriter(fileWriter);
            ) {
            String fileLine = reader.readLine();

            System.out.println("File Contents: ");
            while(fileLine != null) {
                System.out.println(fileLine);
                fileLine = reader.readLine();
            }

            System.out.println("Type what you would like to append to the file: ");
            input = scanner.nextLine();
            BufWriter.write(input);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}