package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования восьмеричного числа в десятичное число.
Входные данные:
Введите любое восьмеричное число: 10
Ожидаемый результат

Эквивалентное десятичное число: 8
 */
public class Task25 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter any octal number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 8);
        System.out.println("Equivalent decimal number: " + result);
    }
}
