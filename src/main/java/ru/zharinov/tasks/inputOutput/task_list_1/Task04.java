package ru.zharinov.tasks.inputOutput.task_list_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Задан файл с java-кодом. Прочитать текст программы из файла и все слова public в объявлении атрибутов и методов класса
заменить на слово private. Результат сохранить в другой заранее созданный файл.
 */
public class Task04 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "main", "java",
                "ru", "zharinov", "tasks", "inputOutput", "task_list_1", "Task03.java");
        String readString = Files.readString(path);

        String result = readString.replace("public", "private");
        Path resultPath = Path.of("Task03.txt");
        Files.writeString(resultPath, result);
    }
}