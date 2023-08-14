package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/*
Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласных букв.
 */
public class Task01 {
    private static final String VOWELS = "уеоаыяию";

    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Family\\Desktop\\test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if (VOWELS.indexOf(firstSymbol) != -1){
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
