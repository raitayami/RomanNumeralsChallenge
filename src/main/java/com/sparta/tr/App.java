package com.sparta.tr;

public class App {

    private static int[] numbers =
            { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] romanNumerals =
            { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static void main( String[] args ) {

        System.out.println(integerToRoman(848));
    }


    public static final String integerToRoman(int number) {

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                number -= numbers[i];
                s.append(romanNumerals[i]);
            }
        }
        return s.toString();
    }

}
