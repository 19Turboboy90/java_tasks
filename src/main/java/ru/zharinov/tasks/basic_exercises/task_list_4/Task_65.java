package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Scanner;

/*
Напишите программу на Java для вычисления модулей двух чисел без использования встроенного оператора модуля.
Пример вывода:

Введите первое число: 19
Введите второе число: 7
5
*/
public class Task_65 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();
        System.out.println(num1 - num1 / num2 * num2);
    }
}

