package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/*
Задан файл с текстом, найти и вывести в консоль все слова, для которых последняя
буква одного слова совпадает с первой буквой следующего слова.
 */
public class Task02 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Family\\Desktop\\test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next();
                if (isEqualLastSymbolAndFirstSymbol(prev, current)) {
                    System.out.println(prev + " " + current);
                }
                prev = current;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isEqualLastSymbolAndFirstSymbol(String prev, String current) {
        return prev.charAt(prev.length() - 1) == current.charAt(0);
    }
}
