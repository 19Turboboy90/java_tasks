package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает три целых числа от пользователя и возвращает true,
если второе число больше первого числа, а третье число больше второго числа.
Если «abc» истинно, второе число не должно быть больше первого числа.
Пример вывода:

Введите первое число: 5
Введите второе число: 10
Введите третье число: 15

 */
public class Task_53 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = console.nextInt();
        System.out.println(num2 > num1 && num3 > num2);
    }
}
