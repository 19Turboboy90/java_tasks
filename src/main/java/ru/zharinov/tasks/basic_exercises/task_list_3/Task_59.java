package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Locale;
import java.util.Scanner;

/*
Напишите программу на Java для преобразования заданной строки в строчные.
Пример вывода:

Введите строку: БЫСТРЫЕ КОРИЧНЕВЫЕ ЛИСЫ ПРЫГАЮТ НАД ЛЕНИВОЙ СОБАКОЙ.
Быстрая коричневая лиса прыгает через ленивую собаку.
 */
public class Task_59 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = console.nextLine();
        System.out.println(text.toLowerCase(Locale.ROOT));
    }
}
