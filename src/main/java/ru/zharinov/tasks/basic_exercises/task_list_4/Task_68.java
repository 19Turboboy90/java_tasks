package ru.zharinov.tasks.basic_exercises.task_list_4;

/*
Напишите программу на Java для создания новой строки из 4 копий последних 3 символов исходной строки.
Длина исходной строки должна быть от 3 и выше.
Строка: Java 3.0
Пример вывода:

3.03.03.03.0
 */
public class Task_68 {
    public static void main(String[] args) {
        String text = "Java 3.0";
        String newText = text.substring(text.length() - 3);
        System.out.println(newText + newText + newText + newText);
    }
}
