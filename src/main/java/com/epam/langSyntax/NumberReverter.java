package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();
        System.out.println(Integer.parseInt(reversed));
    }
}
