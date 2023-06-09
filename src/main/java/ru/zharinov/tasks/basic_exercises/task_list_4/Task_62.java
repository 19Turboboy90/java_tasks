package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает три целочисленных значения и возвращает true, если одно из них равно 20
или больше и меньше вычитаний других.
Пример вывода:

Введите первое число: 15
Введите второе число: 20
Введите третье число: 25
false
 */
public class Task_62 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = console.nextInt();
        System.out.println(Math.abs(num1 - num2) >= 20 || Math.abs(num2 - num3) >= 20 || Math.abs(num1 - num3) >= 20);
    }
}
