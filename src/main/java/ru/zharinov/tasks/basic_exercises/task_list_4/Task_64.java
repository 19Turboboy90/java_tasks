package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает два целых числа от 25 до 75 и возвращает true,
если в обоих числах есть общая цифра.
Пример вывода:

Введите первое число: 35
Введите второе число: 45
Результат: правда
 */
public class Task_64 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number from 25 to 75: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number from 25 to 75: ");
        int num2 = console.nextInt();
        System.out.println(compare(num1, num2));
    }

    private static boolean compare(int num1, int num2) {
        return (num1 / 10 == num2 / 10) || (num1 % 10 == num2 % 10);
    }
}
