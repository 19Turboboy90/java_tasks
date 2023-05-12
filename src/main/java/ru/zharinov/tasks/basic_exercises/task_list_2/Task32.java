package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для сравнения двух чисел.
Входные данные:
Введите первое целое число: 25
Введите второе целое число: 39
Ожидаемый результат

 25! = 39
25 <39
25 <= 39
 */
public class Task32 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = console.nextInt();
        if (number1 != number2) {
            System.out.println(number1 + " != " + number2);
        }
        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " == " + number2);
        } else {
            System.out.printf(number1 + " > " + number2);
        }
    }
}
