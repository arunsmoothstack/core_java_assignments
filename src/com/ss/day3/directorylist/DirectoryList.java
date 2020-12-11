package com.ss.day3.directorylist;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryList {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: Usage must pass directory as command line argument");
            return;
        }
        for(String directory: args) {
            File directoryFiles = new File(directory);
            if(directoryFiles.isDirectory()) {
                for(String fileName : directoryFiles.list()) {
                    System.out.println(fileName);
                }
            } else if (directoryFiles.isFile() ) {
                System.out.println("Must pass in path to directory. you passed a file");
            } else {
                System.out.println("Directory does not exist");
            }
        }
    }
}
