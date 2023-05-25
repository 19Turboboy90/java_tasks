package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java для вычисления суммы двух целых чисел и верните true, если сумма равна третьему целому числу.
Пример вывода:

Введите первое число: 5
Введите второе число: 10
Введите третье число: 15
Результат: правда
 */
public class Task_52 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = console.nextInt();
        System.out.println(num3 == (num1 + num2));
    }
}
