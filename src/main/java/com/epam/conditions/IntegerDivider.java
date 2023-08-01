package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int divisionResult = dividend / divider;
            if (dividend == divisionResult * divider) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }
}