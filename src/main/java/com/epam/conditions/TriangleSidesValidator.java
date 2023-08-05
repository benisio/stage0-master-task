package com.epam.conditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        List<Double> list = new ArrayList<>(List.of(firstSide, secondSide, thirdSide));
        double max = Collections.max(list);
        double min = Collections.min(list);
        list.sort(Comparator.comparingDouble(i -> i));
        double medium = list.get(1);
        if (medium + min > max) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    public static void main(String[] args) {
        (new TriangleSidesValidator()).validate(3, 4, 5);
        (new TriangleSidesValidator()).validate(-3, -4, -5);

    }
}
