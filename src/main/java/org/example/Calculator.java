package org.example;

import java.util.stream.DoubleStream;

public class Calculator {

    public static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    public static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b); // change 1 to 2 for multiplication bug
    }
}