package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Integer_To_Roman
@class  $444B
@since 19.10.2024 - 15.54
*/

public class Main {
    public static void main(String[] args) {
        IntegerToRoman converter = new IntegerToRoman();
        String roman = converter.intToRoman(1994);
        System.out.println(roman);
    }
}
