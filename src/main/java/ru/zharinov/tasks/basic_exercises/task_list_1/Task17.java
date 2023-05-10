package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите программу на Java, чтобы добавить два двоичных числа

Входные данные:
Введите первое двоичное число: 10
Введите второе двоичное число: 11
Ожидаемый результат

 Сумма двух двоичных чисел: 101
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the first binary number: ");
        String first = console.nextLine();
        int num1 = Integer.parseInt(first, 2);
        System.out.println("Enter the second binary number: ");
        String second = console.nextLine();
        int num2 = Integer.parseInt(second, 2);
        int result = num1 + num2;
        System.out.println("The sum of two binary numbers: " + Integer.toBinaryString(result));
    }
}
