package com.ss.day2.commandlinesum;

/**
 * This Program takes integers from command line arguments and outputs the sum.
 *
 * @author Arun Mavumkal
 * @version 1.0
 */
public class CommandLineSum {
    // must define command line arguments in ide or run executable in terminal with args.
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum of inputs: " + sum);
    }
}
