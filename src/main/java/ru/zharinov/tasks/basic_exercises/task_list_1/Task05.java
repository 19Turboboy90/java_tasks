package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите программу Java, которая принимает два числа в качестве входных данных и отображает произведение двух чисел.

Тестовые данные:
Введите первое число: 25
Введите второе число: 5
Ожидаемый результат :
25 х 5 = 125
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int number1 = console.nextInt();
        System.out.println("enter the second number: ");
        int number2 = console.nextInt();
        int result = number1 * number2;
        System.out.println("the product of numbers " + number1 + " and " + number1 + " = " + result);
    }
}
