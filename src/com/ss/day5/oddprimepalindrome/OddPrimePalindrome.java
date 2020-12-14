package com.ss.day5.oddprimepalindrome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arun Mavumkal
 */
public class OddPrimePalindrome {

    /**
     * checks if value passed into lambda is even;
     * @return - Returns string EVEN if lambda parameter num is even or else returns ODD
     */
    public IntParser isOdd() {
        return num -> num%2 == 0 ? "EVEN" : "ODD";
    }

    /**
     * checks if value passed into lambda is a prime
     * @return - returns lambda that processes weather or not num is prime
     */
    public IntParser isPrime() {
        final String PRIME = "PRIME";
        final String COMPOSITE = "COMPOSITE";
        return num -> {
            if (num == 2) return PRIME;
            if (num <= 1 || num % 2 == 0) return COMPOSITE;
            for (int i = 3; i <= Math.sqrt(num); i+= 2)
                if(num % i == 0)
                    return COMPOSITE;
            return PRIME;
        };
    }

    /**
     * checks if value passed into lambda is a palindrome
     * @return - returns lambda that processes weather or not num is palindrome
     */
    public IntParser isPalindrome() {
        return num -> {
            int value = num;
            int reversedValue = 0;
            int currentDigit;
            do {
                currentDigit = value%10;
                reversedValue = (reversedValue * 10) + currentDigit;
                value = value/10;
            } while(value != 0);
            if(num == reversedValue)
                return "PALINDROME";
            else
                return"NOTPALINDROME";
        };
    }

    /**
     * reads in test cases from ./lamdaAssignmentInputs file
     * @return - returns list of test cases
     */
    private List<String> readInTestCases() {
        ArrayList<String> resultArry = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("./lamdaAssignmentInputs"));
            String fileLine = reader.readLine();
            while(fileLine != null) {
                resultArry.add(fileLine);
                fileLine = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultArry;
    }

    //parses test array and runs tests
    public void runTests() {
        List<Integer> list;
        for(String nums : readInTestCases()) {
            System.out.println("Testing Case {" + nums + "}");
            //list.clear();
            list = Arrays.stream(nums.split(" ")).map(Integer::parseInt)
                    .collect(Collectors.toList());
            printMethods(list);
            list.clear();
            System.out.println();
        }
    }

    public void printMethods(List<Integer> list) {
        list.parallelStream().forEach(num -> {
            System.out.println("Test Result For: " + num);
            System.out.println(isOdd().parseInteger(num));
            System.out.println(isPrime().parseInteger(num));
            System.out.println(isPalindrome().parseInteger(num));
        });
    }

    public static void main(String[] args) {
        OddPrimePalindrome oddPrime = new OddPrimePalindrome();
        oddPrime.runTests();
    }
}
