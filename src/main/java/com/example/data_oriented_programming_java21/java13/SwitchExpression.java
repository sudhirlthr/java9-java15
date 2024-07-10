package com.example.data_oriented_programming_java21.java13;

import java.util.List;

public class SwitchExpression {
    //java 13
    //java 15: text block with three dots: ''' line1, line2'''

    public static void main(String[] args) {
        List.of("January", "February", "March", "April", "May").forEach(m -> {
            System.out.println(switchExpression(m));
        });

        // java 15
        String formatted = "Hi %s".formatted("Sudhir");
        System.out.println("formatted string: "+formatted);
        System.out.printf("Hi %s%n", "Sudhir");
    }

    private static Months switchExpression(String month) {
        return switch (month) {
            case "January" -> {
                System.out.println("Hey, you called for " + Months.January);
                yield Months.January;
            }
            case "February" -> Months.February;
            case "March" -> Months.March;
            case "April" -> Months.April;
            case "May" -> Months.May;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }

    public enum Months {
        January, February, March, April, May
    }
}