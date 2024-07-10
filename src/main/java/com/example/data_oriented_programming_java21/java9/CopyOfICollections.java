package com.example.data_oriented_programming_java21.java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOfICollections {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        System.out.println("Modifiable list before modification"+stringList);
        addToList(stringList);
        System.out.println("Modifiable list after modification"+stringList);
        // get UnModifiableList
        //List<String> stringList = Arrays.asList("One", "Two, Three", "Four", "Five");
        //List<String> unmodifiableList = List.copyOf(stringList);
        List<String> unmodifiableList = List.of("One", "Two, Three", "Four", "Five", "Six");
        System.out.println("Unmodifiable list before modification"+unmodifiableList);
        try{
            addToList(unmodifiableList);
            System.out.println("Unmodifiable list after modification"+unmodifiableList);
        } catch (Exception e){
            throw new RuntimeException("Unnhmmm, you cant modify unmodifiable list");
        }
    }

    private static void addToList(List<String> stringList) {
        stringList.add("OtherElement");
    }
}
