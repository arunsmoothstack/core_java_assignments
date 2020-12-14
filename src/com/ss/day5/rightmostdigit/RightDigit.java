package com.ss.day5.rightmostdigit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(32,12, 105, 10001, 13));

    public static void main(String[] args) {
        list.stream()
                .map(num -> num%10)
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);
    }
}
