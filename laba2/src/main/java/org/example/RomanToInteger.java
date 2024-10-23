package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Roman_To_Integer
@class  $444B
@since 19.10.2024 - 17.35
*/

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int convertToInteger(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Неправильний формат римського числа: ");
        }

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char ch = roman.charAt(i);
            int value = romanMap.getOrDefault(ch, 0);

            if (value == 0) {
                throw new IllegalArgumentException("Неправильний формат римського числа: " + roman);
            }

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }
        return total;
    }
}
