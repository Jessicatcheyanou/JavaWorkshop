package main.functionalProgramming;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public final class ReadFilesMain {

    public static void main(String[] args) throws IOException {
        List<String> fileNames = Arrays.asList("file-a.txt", "file-b.txt", "file-c.txt");

        fileNames.stream()
                .map(Path::of)
                .map(p -> {
                    //we can handle checked Exceptions using a try-catch inside a lambda
                    try {
                        return Files.readAllLines(p, StandardCharsets.UTF_8);
                    } catch (IOException e) {
                        return List.of();
                    }
                })
                .flatMap(List::stream)
                .forEach(System.out::println);

        //OR with a for loop
        for(String fileName : fileNames) {
            for (String line : Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8)) {
                System.out.println(line);
            }
        }
    }


}
