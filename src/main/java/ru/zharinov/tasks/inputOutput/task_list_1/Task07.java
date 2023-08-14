package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/*
Напишите программу на Java для чтения первых 3 строк из файла.
 */
public class Task07 {
    public static void main(String[] args) {
        Path path = Path.of("C:", "Users", "Family", "Desktop", "test.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.limit(3)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
