package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // печатаем пробелы
            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // печатаем с cathetusLength до 1
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
