package com.ss.day5.commaseparatedintegers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author arun mavumkal
 * @param <T>
 */
public class CommaInt<T> {
    private static final int SIZE = 10;

    private List<T> arry;

    /**
     * takes FillList lamda to fill array;
     * @param fillList - lambda used to fill array
     */
    public CommaInt(FillList<T> fillList) {
        arry = new ArrayList<>();
        arry = fillList.fillList(arry);
    }

    /**
     * @param separator - separator lambda that reads the array and generates a comma separated list
     * @return - returns String with comma separated list
     */
    public String getSeparatedList(CommaSeparate<T> separator) {
        return separator.parseIntArray(this.arry);
    }

    /**
     * @return returns lamda that iterates through an integer array and outputs a comma separated string
     */
    public static CommaSeparate<Integer> separateByOddEven() {
        return arry -> {
            StringBuilder builder = new StringBuilder(SIZE*3);
            arry.parallelStream().forEach(value -> {
                if(value % 2 == 0)
                    builder.append("e");
                else
                    builder.append(("o"));
                builder.append(value);
                builder.append(",");
            });
            return builder.toString();
        };
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        CommaInt<Integer> commaInt = new CommaInt(arry-> {
            for (int i = 0; i < 10; ++i)
                arry.add(new Random().nextInt(100));
            return arry;
        });
        System.out.println(commaInt.getSeparatedList(separateByOddEven()));
    }


}
