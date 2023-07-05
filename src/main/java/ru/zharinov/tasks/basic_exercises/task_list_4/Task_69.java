package ru.zharinov.tasks.basic_exercises.task_list_4;
/*
Напишите программу на Java для извлечения первой половины строки четной длины.
Тестовые данные: Java
Пример вывода:

Ja
 */
public class Task_69 {
    public static void main(String[] args) {
        String text = "Java";
        System.out.println(text.substring(0, text.length() / 2));
    }
}
