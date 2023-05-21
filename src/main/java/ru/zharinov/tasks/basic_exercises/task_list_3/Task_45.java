package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Напишите программу на Java, чтобы найти размер указанного файла.
Пример вывода:

/home/students/abc.txt: 0 байт
/home/students/test.txt: 0 байт
 */
public class Task_45 {
    public static void main(String[] args) throws IOException {
        String file = "abc.txt";
        long size = Files.size(Path.of(file));
        System.out.println("abc.txt: " + size + " bytes");
    }
}
