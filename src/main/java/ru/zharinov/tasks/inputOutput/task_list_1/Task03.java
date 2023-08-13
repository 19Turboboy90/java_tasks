package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд
 */
public class Task03 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Family\\Desktop\\test.txt");
        Files.readAllLines(path).stream()
                .map(Task03::findMaxDigitsSymbol)
                .forEach(System.out::println);
    }

    public static int findMaxDigitsSymbol(String s) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            } else {
                if (result < count) {
                    result = count;
                }
                count = 0;
            }
        }
        return result;
    }
}
