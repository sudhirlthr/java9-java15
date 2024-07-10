package com.example.data_oriented_programming_java21.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNot {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(2, 434, 545, 66, 21, 11, 123, 1123, 10, 11, 12, 13, 14);
        Predicate<Integer> evenPredicate = integer -> integer%2==0;
        // will print all even number
        System.out.println("Even numbers:");
        integerList.stream().filter(evenPredicate).toList().forEach(System.out::println);
        System.out.println("Odd numbers:");
        integerList.stream().filter(evenPredicate.negate()).toList().forEach(System.out::println);
        System.out.println("With Predicate.not():java11");
        integerList.stream().filter(Predicate.not(PredicateNot::isEven)).forEach(System.out::println);
    }
    private static boolean isEven(Integer number){
        return number%2 == 0;
    }
}
