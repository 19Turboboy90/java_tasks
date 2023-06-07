package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, чтобы найти число целых чисел в диапазоне двух указанных чисел, которые делятся на другое
число. Перейти к редактору
Например, x = 5, y = 20 и p = 3, найдите количество целых чисел в диапазоне x..y, которые делятся на p,
т. Е. {I: x ≤ i ≤ y, i mod p = 0}

Пример вывода:
5
 */
public class Task_56 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = console.nextInt();
        System.out.println(getNumber(num1, num2, num3));
    }

    private static int getNumber(int a, int b, int c) {
        int count = 0;
        for (int i = a; i < b; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        return count;
    }
}
