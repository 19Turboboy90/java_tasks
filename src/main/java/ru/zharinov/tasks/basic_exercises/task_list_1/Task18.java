package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите программу на Java для умножения двух двоичных чисел.

Входные данные:
Введите первое двоичное число: 10
Введите второе двоичное число: 11
Ожидаемый результат

Произведение двух двоичных чисел: 110
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String first = console.nextLine();
        int num1 = Integer.parseInt(first, 2);
        System.out.println(num1);
        System.out.print("Enter the second number: ");
        String second = console.nextLine();
        int num2 = Integer.parseInt(second, 2);
        int result = num1 * num2;
        System.out.println("The product of two binary numbers: " + Integer.toBinaryString(result));

    }
}