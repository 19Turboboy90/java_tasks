package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

/*
Напишите Java-программу для построчного хранения содержимого текстового файла в массиве.
 */
public class Task09 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:", "Users", "Family", "Desktop", "test.txt");
        File file = new File("C:\\Users\\Family\\Desktop\\test.txt");

        try (Scanner scanner = new Scanner(path)) {
            int count = 0;
            String[] arrayTextOfLine = new String[128];
            while (scanner.hasNextLine()) {
                arrayTextOfLine[count++] = scanner.nextLine();
            }
            System.out.println(Arrays.toString(arrayTextOfLine));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
