package com.ss.day5.basiclamdas;

import java.util.*;

public class BasicLamdas {
    final static List<String> AC_MANUFACTURERS =
            new ArrayList<>(Arrays.asList(
                    "Boeing",
                    "Airbus",
                    "Lockheed Martin",
                    "Gulfstream",
                    "Cessna",
                    "embraer"
            ));

    /**
     *
     */
    public static void printOEMList() {
        AC_MANUFACTURERS.forEach(System.out::println);
    }

    /**
     * takes a string and checks if the first character is equal to e; returns -1 if it does.
     * @param oem1
     * @return
     */
    public static Integer firstCharE(String oem1) {
            if (oem1.charAt(0) == 101) // checks for e
                return -1;
            return 0;
    }

    public static void main(String[] args) {

        System.out.println("\nPrinting Short to long list");
        Collections.sort(AC_MANUFACTURERS, (oem1, oem2) -> {
            if (oem1.length() < oem2.length())
                return -1;
            else if(oem1.length() > oem2.length())
                return 1;
            else return 0;
        });

        printOEMList();
        System.out.println("\nPrinting long to short list");
        Collections.sort(AC_MANUFACTURERS, (oem1, oem2) -> {
            if (oem1.length() > oem2.length())
                return -1;
            else if(oem1.length() < oem2.length())
                return 1;
            else return 0;
        });

        printOEMList();
        System.out.println("\nPrinting alpha order first char only");
        Collections.sort(AC_MANUFACTURERS, (oem1, oem2) -> {
            if (oem1.toLowerCase().charAt(0) < oem2.toLowerCase().charAt(0))
                return -1;
            if(oem1.toLowerCase().charAt(0) > oem2.toLowerCase().charAt(0))
                return 1;
            return 0;
        });

        printOEMList();
        System.out.println("\nPrinting with first char e first");
        Collections.sort(AC_MANUFACTURERS, (oem1, oem2) -> {
            if (oem1.charAt(0) == 101)
                return -1;
            return 0;
        });

        printOEMList();
        System.out.println("\nPrinting with first char e first with helper");
        Collections.sort(AC_MANUFACTURERS, (oem1, oem2) -> firstCharE(oem1));
        printOEMList();
    }
}
