package com.ss.day2.twodimensionalmax;

import java.util.Random;

/**
 * Program constructs 2 demensional array using random integers between 1 and 100 and finds max value in that array;
 * @author Arun Mavumkal
 * @version 1.0
 */
public class TwoDimensionalMax {
    /**
     * @param arry - 2 dimensional int array must be declared and defined must not be null
     */
    void fillArray(int[][] arry) {
        Random random = new Random();
        for (int row = 0; row < arry.length; ++row) {
            for(int col = 0; col < arry[row].length; ++col) {
                arry[row][col] = random.nextInt(999) + 1;
            }
        }
    }

    /**
     * @param arry - 2 dimensional int array must be declared and defined must not be null
     */
    void printArry(int[][] arry) {
        for(int row = 0; row < arry.length; ++row) {
            for(int col = 0; col < arry[row].length; ++col) {
                System.out.print(arry[row][col] + "\t\t");
            }
            System.out.println();
        }
    }

    /**
     * @param arry - 2 dimensional int array must be declared and defined must not be null
     * @return - returns 1D integer array
     */
    int[] findMaxLocation(int[][] arry) {
        int[] resultArry = new int[2];
        int max = 0;
        for (int row = 0; row < arry.length; ++row) {
            for(int col = 0; col < arry[row].length; ++col) {
                int currentValue = arry[row][col];
                if(currentValue > max) {
                    max = currentValue;
                    resultArry[0] = row;
                    resultArry[1] = col;
                }
            }
        }
        return resultArry;
    }

    public static void main(String[] args) {
        final int SIZE_X = 10;
        final int SIZE_Y = 10;
        TwoDimensionalMax twoDimensionalMax = new TwoDimensionalMax();
        int[] maxLocation;
        int [][] arry = new int [SIZE_X][SIZE_Y];
        twoDimensionalMax.fillArray(arry);
        twoDimensionalMax.printArry(arry);
        maxLocation = twoDimensionalMax.findMaxLocation(arry);
        System.out.println("Max Value: " + arry[maxLocation[0]][maxLocation[1]]);
        System.out.println("Max Location: " + maxLocation[0] + ", " + maxLocation[1]); // outputs array index of
    }
}
