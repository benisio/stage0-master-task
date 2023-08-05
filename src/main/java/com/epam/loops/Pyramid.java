package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // печатаем пробелы
            for (int j = 0; j < i; j++) {

            }

            // печатаем с cathetusLength до 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // печатаем с 2 до cathetusLength
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
