package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint > 0) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(numberTableToPrint + " * " + i + " = " + numberTableToPrint * i);
            }
        }
    }
}
