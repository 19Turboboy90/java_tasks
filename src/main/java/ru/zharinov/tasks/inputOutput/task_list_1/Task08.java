package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/*
Напишите программу на Java для добавления текста в существующий файл.
 */
public class Task08 {
    public static void main(String[] args) {
        Path path = Path.of("C:", "Users", "Family", "Desktop", "test.txt");
        try (Scanner console = new Scanner(System.in);
             BufferedWriter bufferedWriter =
                     Files.newBufferedWriter(path, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            bufferedWriter.newLine();
            bufferedWriter.write(console.nextLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
