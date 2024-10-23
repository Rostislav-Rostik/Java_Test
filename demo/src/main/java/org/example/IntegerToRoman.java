package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Integer_To_Roman
@class  $444B
@since 19.10.2024 - 15.54
*/

public class IntegerToRoman {

    public String intToRoman(int num) {
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romanNumerals[i]);
            }
        }
        return result.toString();
    }
}

