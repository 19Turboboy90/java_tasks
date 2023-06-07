package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает три целых числа от пользователя и возвращает true, если два или более из
них (целые числа) имеют одинаковую самую правую цифру. Целые числа неотрицательны.
Пример вывода:

Введите первое число: 5
Введите второе число: 10
Введите третье число: 15
Результат: правда
 */
public class Task_54 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = console.nextInt();
        if (num1 > 0 && num2 > 0 && num3 > 0) {
            if (num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num1 % 10 == num3 % 10) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
