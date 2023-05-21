package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает число и проверяет, является ли число четным или нет. Печатает 1,
если число четное, или 0, если число нечетное.
Пример вывода:

Введите число: 20
1
 */
public class Task_49 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = console.nextInt();
        int result = number % 2 == 0 ? 1 : 0;
        System.out.println(result);
    }
}
