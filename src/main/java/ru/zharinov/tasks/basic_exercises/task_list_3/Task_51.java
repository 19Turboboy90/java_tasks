package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования строки в целое число в Java.
Пример вывода:

Введите число (строку): 25
Целочисленное значение: 25
 */
public class Task_51 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number (string): ");
        String number = console.nextLine();
        System.out.println("Integer value: " + Integer.parseInt(number));
    }
}
