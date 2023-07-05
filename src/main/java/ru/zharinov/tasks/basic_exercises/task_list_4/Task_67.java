package ru.zharinov.tasks.basic_exercises.task_list_4;

/*
Напишите программу на Java для вставки слова в середину другой строки.
Вставить «Учебник» в середине «Python 3.0», поэтому результатом будет Java Tutorial 3.0
Пример вывода:

Java Tutorial 3.0
 */
public class Task_67 {
    public static void main(String[] args) {
        String java = "Java 3.0";
        String text = "Tutorial";
        System.out.println(java.substring(0,5) + text + java.substring(4));
    }
}
