package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для преобразования шестнадцатеричного числа в десятичное число.
Входные данные:
Введите шестнадцатеричное число: 25
Ожидаемый результат

Эквивалентное десятичное число: 37
 */
public class Task28 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String number = console.nextLine();
        int result = Integer.parseInt(number, 16);
        System.out.println("Equivalent decimal number: " + result);
    }
}
