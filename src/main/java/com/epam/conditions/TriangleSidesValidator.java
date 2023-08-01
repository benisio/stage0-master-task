package com.epam.conditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        List<Double> list = new ArrayList<>(List.of(firstSide, secondSide, thirdSide));
        double max = Collections.max(list);
        double min = Collections.min(list);
        list.removeAll(List.of(min, max));
        double medium = list.get(0);
        if (medium + min > max) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
