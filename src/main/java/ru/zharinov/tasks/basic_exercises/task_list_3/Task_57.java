package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает целое число и подсчитывает множители числа.
Пример вывода:

Введите целое число: 25
3
 */
public class Task_57 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = console.nextInt();
        System.out.println(primeNumber(number));
    }

    private static int primeNumber(int num) {
        int result = 0;
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0 && i * i != num) {
                result += 2;
            } else if (i * i == num) {
                result++;
            }
        }
        return result;
    }
}
