package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Напишите программу на Java, чтобы найти самое длинное слово в текстовом файле.
 */
public class Task06 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:", "Users", "Family", "Desktop", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String result = "";
            while (scanner.hasNext()){
                String maxWord = scanner.next();
                if (result.length() < maxWord.length()){
                    result = maxWord;
                }
            }
            System.out.println("Maximum word in the file: " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
