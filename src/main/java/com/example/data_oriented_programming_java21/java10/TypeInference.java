package com.example.data_oriented_programming_java21.java10;

import java.util.List;

public class TypeInference {
    public static void main(String[] args) {
        List<String> stringList = List.of("One", "Two", "Three", "Four", "Five");
        List<String> stringList2 = List.of("One1", "Two", "Three", "Four", "Five5");
        // Type Inference
        var list = List.of(stringList, stringList2);
        list.stream().forEach(System.out::println);
    }
}
