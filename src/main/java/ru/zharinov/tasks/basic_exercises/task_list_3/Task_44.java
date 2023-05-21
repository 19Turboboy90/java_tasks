package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает целое число (n) и вычисляет значение n + nn + nnn.
Пример вывода:

Введите номер: 5
5 + 55 + 555
 */
public class Task_44 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = console.nextLine();
        System.out.println(num + " + " + (num + num) + " + " + (num + num + num));
    }
}
