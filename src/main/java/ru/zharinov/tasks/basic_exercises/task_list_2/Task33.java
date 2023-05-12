package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java и вычислите сумму цифр целого числа.
Входные данные:
Введите целое число: 25
Ожидаемый результат

Сумма цифр: 7
 */
public class Task33 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = console.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(number));
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}

