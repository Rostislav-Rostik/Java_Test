package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Integer_To_Roman
@class  $444B
@since 19.10.2024 - 15.54
*/

import static org.junit.Assert.assertEquals;

import org.example.IntegerToRoman;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testOne() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("I", converter.intToRoman(1));
    }

    @Test
    public void testTwo() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("II", converter.intToRoman(2));
    }

    @Test
    public void testThree() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("III", converter.intToRoman(3));
    }

    @Test
    public void testFour() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("IV", converter.intToRoman(4));
    }

    @Test
    public void testFive() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("V", converter.intToRoman(5));
    }

    @Test
    public void testSix() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("VI", converter.intToRoman(6));
    }

    @Test
    public void testSeven() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("VII", converter.intToRoman(7));
    }

    @Test
    public void testEight() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("VIII", converter.intToRoman(8));
    }

    @Test
    public void testNine() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("IX", converter.intToRoman(9));
    }

    @Test
    public void testTen() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("X", converter.intToRoman(10));
    }

    @Test
    public void testTwenty() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XX", converter.intToRoman(20));
    }

    @Test
    public void testThirty() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XXX", converter.intToRoman(30));
    }

    @Test
    public void testForty() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XL", converter.intToRoman(40));
    }

    @Test
    public void testFifty() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("L", converter.intToRoman(50));
    }

    @Test
    public void testSixty() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("LX", converter.intToRoman(60));
    }

    @Test
    public void testSeventy() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("LXX", converter.intToRoman(70));
    }

    @Test
    public void testEighty() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("LXXX", converter.intToRoman(80));
    }

    @Test
    public void testNinety() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XC", converter.intToRoman(90));
    }

    @Test
    public void testHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("C", converter.intToRoman(100));
    }

    @Test
    public void testTwoHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("CC", converter.intToRoman(200));
    }

    @Test
    public void testThreeHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("CCC", converter.intToRoman(300));
    }

    @Test
    public void testFourHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("CD", converter.intToRoman(400));
    }

    @Test
    public void testFiveHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("D", converter.intToRoman(500));
    }

    @Test
    public void testSixHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("DC", converter.intToRoman(600));
    }

    @Test
    public void testSevenHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("DCC", converter.intToRoman(700));
    }

    @Test
    public void testEightHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("DCCC", converter.intToRoman(800));
    }

    @Test
    public void testNineHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("CM", converter.intToRoman(900));
    }

    @Test
    public void testThousand() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("M", converter.intToRoman(1000));
    }

    @Test
    public void testTwoThousand() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("MM", converter.intToRoman(2000));
    }

    @Test
    public void testThreeThousand() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("MMM", converter.intToRoman(3000));
    }

    @Test
    public void testEdgeCaseFour() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("IV", converter.intToRoman(4));
    }

    @Test
    public void testEdgeCaseNine() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("IX", converter.intToRoman(9));
    }

    @Test
    public void testEdgeCaseForty() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XL", converter.intToRoman(40));
    }

    @Test
    public void testEdgeCaseNinety() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XC", converter.intToRoman(90));
    }

    @Test
    public void testEdgeCaseFourHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("CD", converter.intToRoman(400));
    }

    @Test
    public void testEdgeCaseNineHundred() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("CM", converter.intToRoman(900));
    }

    @Test
    public void testRandomTwentySeven() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XXVII", converter.intToRoman(27));
    }

    @Test
    public void testRandomFiftyEight() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("LVIII", converter.intToRoman(58));
    }

    @Test
    public void testRandomNinetyNine() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XCIX", converter.intToRoman(99));
    }

    @Test
    public void testRandomOneHundredFortyFour() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("CXLIV", converter.intToRoman(144));
    }

    @Test
    public void testRandomEightNinety() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("DCCCXC", converter.intToRoman(890));
    }

    @Test
    public void testRandomNineteenNinetyFour() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("MCMXCIV", converter.intToRoman(1994));
    }
}
