package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first = first ^ second;
        // binary equivalent of y  will become 0101 ie y=5
        second = first ^ second;
        // binary equivalent of x  will become 1010 ie x=10
        first = first ^ second;

        System.out.println(first);
        System.out.println(second);
    }

}
