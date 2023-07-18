package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Scanner;

/*
Напишите программу на Java для создания объединения двух строк, за исключением удаления первого символа каждой строки.
Длина строк должна быть от 1 и выше.
Тестовые данные: Str1 = Java
Str2 = Tutorial
Пример вывода:
avautorial

 */
public class Task_71 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str1 = console.nextLine();
        System.out.print("Enter the text: ");
        String str2 = console.nextLine();
        System.out.println(str1.substring(1) + str2.substring(1));
    }
}
