package com.example.data_oriented_programming_java21.java11;

public class StringUtility {
    public static void main(String[] args) {
        //isBlank
        //strip()
        //lines()
        System.out.println(" ".isBlank());
        System.out.println(" LR ".stripLeading().replace(" ", "<Space>"));
        System.out.println(" LR ".stripTrailing().replace(" ", "<Space>"));
        System.out.println(" LR ".strip().replace(" ", "<Space>"));

        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

        //java 12
        String transformed = "Sudhir".transform(s -> s.substring(2));
        System.out.println("transformed: "+transformed);

        // jav14 give more cleaner NullPointerException, like what variable was null
    }
}
