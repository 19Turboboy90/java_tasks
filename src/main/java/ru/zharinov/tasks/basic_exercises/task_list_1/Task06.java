package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите Java-программу для печати суммы (сложения), умножения, вычитания, деления и остатка двух чисел.

Тестовые данные:
Введите первое число: 125
Введите второе число: 24
Ожидаемый результат :
125 + 24 = 149
125 - 24 = 101
125 х 24 = 3000
125/24 = 5
125 мод 24 = 5
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int number1 = console.nextInt();
        System.out.println("enter the second number: ");
        int number2 = console.nextInt();
        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int remains = number1 % number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " % " + number2 + " = " + remains);
    }
}
