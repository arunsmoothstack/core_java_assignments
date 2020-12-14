package com.ss.day5.commaseparatedintegers;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommaIntTest {
    @Test
    public void getSeparatedList() {
        String[] resultArry;
        Set<String> resultSet= new HashSet<>(Arrays.asList("o3","e2","e10"));
        CommaInt<Integer> commaInt = new CommaInt<>( arry -> {
            arry.add(3);
            arry.add(2);
            arry.add(10);
            return arry;
        });
        resultArry = commaInt.getSeparatedList(CommaInt.separateByOddEven()).split(",");
        Arrays.stream(resultArry).forEach(val -> assertTrue(resultSet.contains(val)));
    }

    @Test
    public void separateByOddEven() {
        String result = CommaInt.separateByOddEven().parseIntArray(new ArrayList<>(Arrays.asList(5, 7, 14)));
        Set<String> resultSet= new HashSet<>(Arrays.asList("o5","o7","e14"));
        String[] resultArry = result.split(",");
        Arrays.stream(resultArry).forEach(val -> assertTrue(resultSet.contains(val)));
    }
}
