package com.example.data_oriented_programming_java21.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        String readString = Files.readString(Paths.get("/Users/sudhirkumar/spring-poc/data-oriented-programming-java21/src/main/resources/java11FileExample.txt"));
        System.out.println("Data from file: "+readString);
        String newFileContent = readString.replace("", "Line ");
        Path path = Paths.get("/Users/sudhirkumar/spring-poc/data-oriented-programming-java21/src/main/resources/java11FileExample-newFile.txt");
        Files.writeString(path, newFileContent);
        System.out.println("Done reading and writing!");

    }
}
