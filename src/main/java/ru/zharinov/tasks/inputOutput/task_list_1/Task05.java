package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

/*
Задан файл с java-кодом. Прочитать текст программы из файла и записать
 в другой файл в обратном порядке символы каждой строки
 */
public class Task05 {
    public static void main(String[] args) {
        Path path = Path.of("src", "main", "java",
                "ru", "zharinov", "tasks", "inputOutput", "task_list_1", "Task03.java");
        Path resultPath = Path.of("Result.txt");

        try (Stream<String> lines = Files.lines(path);
             BufferedWriter bufferedWriter =
                     Files.newBufferedWriter(resultPath, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
