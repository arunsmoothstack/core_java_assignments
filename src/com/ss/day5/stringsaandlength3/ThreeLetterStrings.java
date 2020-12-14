package com.ss.day5.stringsaandlength3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeLetterStrings {
    public static ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "afp",
            "apl",
            "ordfa",
            "allf",
            "fat",
            "ext4",
            "afdaf",
            "all"
    ));

    public static List<String> filterThreeLetterA() {
        return list.parallelStream()
                .filter(value-> value.length() == 3 && value.charAt(0) == 'a')
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterThreeLetterA());
    }

}
