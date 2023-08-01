package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numberStr.charAt(i)));
        }
        System.out.println(sum);
    }
}
