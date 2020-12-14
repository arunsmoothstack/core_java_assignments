package com.ss.day5.oddprimepalindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OddPrimePalindromeTest {
    private OddPrimePalindrome oddPrimePalindrome = new OddPrimePalindrome();

    @Test
    public void isPrime() {
        final String PRIME = "PRIME";
        final String COMPOSITE = "COMPOSITE";
        IntParser parser = oddPrimePalindrome.isPrime();
        assertEquals(PRIME, parser.parseInteger(43));
        assertEquals(PRIME, (parser.parseInteger(2)));
        assertEquals(COMPOSITE, (parser.parseInteger(100)));
        assertEquals(PRIME, parser.parseInteger(3));
        assertEquals(COMPOSITE, parser.parseInteger(1));
    }

    @Test
    public void isPalindrome() {
        final String PALINDROME = "PALINDROME";
        final String NOT_PALINDROME = "NOTPALINDROME";
        IntParser parser = oddPrimePalindrome.isPalindrome();
        assertTrue(oddPrimePalindrome.isPalindrome() instanceof IntParser);
        assertEquals(PALINDROME, parser.parseInteger(3));
        assertEquals(NOT_PALINDROME, parser.parseInteger(123));
        assertEquals(PALINDROME, parser.parseInteger(121));
    }

    @Test
    public void isOdd() {
        final String EVEN = "EVEN";
        final String ODD = "ODD";
        IntParser parser = oddPrimePalindrome.isOdd();
        assertEquals(EVEN, parser.parseInteger(4));
        assertEquals(ODD, parser.parseInteger(5));
    }
}
