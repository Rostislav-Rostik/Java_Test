package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Roman_To_Integer
@class  $444B
@since 19.10.2024 - 17.35
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void testEmptyStringThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanToInteger.convertToInteger("");
        });
        assertEquals("Неправильний формат римського числа: ", exception.getMessage());
    }

    @Test
    void testNullThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanToInteger.convertToInteger(null);
        });
        assertEquals("Неправильний формат римського числа: ", exception.getMessage());
    }

    @Test
    void testInvalidRomanThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanToInteger.convertToInteger("ABC");
        });
        assertEquals("Неправильний формат римського числа: ABC", exception.getMessage());
    }

    @Test
    void testSingleRomanNumeral() {
        assertEquals(1, RomanToInteger.convertToInteger("I"));
        assertEquals(5, RomanToInteger.convertToInteger("V"));
        assertEquals(10, RomanToInteger.convertToInteger("X"));
    }

    @Test
    void testMultipleSameRomanNumerals() {
        assertEquals(3, RomanToInteger.convertToInteger("III"));
        assertEquals(20, RomanToInteger.convertToInteger("XX"));
        assertEquals(2000, RomanToInteger.convertToInteger("MM"));
    }

    @Test
    void testSubtractiveCombination() {
        assertEquals(4, RomanToInteger.convertToInteger("IV"));
        assertEquals(9, RomanToInteger.convertToInteger("IX"));
        assertEquals(40, RomanToInteger.convertToInteger("XL"));
        assertEquals(90, RomanToInteger.convertToInteger("XC"));
        assertEquals(400, RomanToInteger.convertToInteger("CD"));
        assertEquals(900, RomanToInteger.convertToInteger("CM"));
    }

    @Test
    void testComplexRomanNumeral() {
        assertEquals(58, RomanToInteger.convertToInteger("LVIII"));
        assertEquals(1994, RomanToInteger.convertToInteger("MCMXCIV"));
    }

    @Test
    void testLeadingSubtractiveCombination() {
        assertEquals(14, RomanToInteger.convertToInteger("XIV"));
        assertEquals(16, RomanToInteger.convertToInteger("XVI"));
    }

    @Test
    void testMixedRomanNumerals() {
        assertEquals(27, RomanToInteger.convertToInteger("XXVII"));
        assertEquals(42, RomanToInteger.convertToInteger("XLII"));
    }

    @Test
    void testLargeRomanNumeral() {
        assertEquals(3888, RomanToInteger.convertToInteger("MMMDCCCLXXXVIII"));
    }
}
