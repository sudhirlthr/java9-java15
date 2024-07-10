package com.example.data_oriented_programming_java21.java14;

public class RecordsExample {

    // from jdk14 records introduced to eliminate verberos code for PJO classes
    record Person(String name, String email, String phone){}
    public static void main(String[] args) {
        Person person = new Person("Sk", "abc@gmail.com", "123-345;4567");
        System.out.println(person);
        Person person2 = new Person("Sk", "abc@gmail.com", "123-345;4567");
        System.out.println(person.equals(person2));
        Person person3 = new Person("Sk3", "abc@gmail.com", "123-345;4567");
        System.out.println(person.equals(person3));
    }
}
