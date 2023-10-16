package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.Scanner;

/*
Реализовать программу, которая принимает на вход через консоль с помощью Scanner, число, соответствующее количеству
этажей в здании.
Используя условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.

Условия: если этажей 1-4 - "Малоэтажный дом", 5-8 - "Среднеэтажный дом", 9 и более - "Многоэтажный дом".
Так же, необходимо учесть что может быть введено отрицательное значение. В таком случае сообщить о некорректности ввода.
 */
public class Task_84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 1 && num <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (num >= 5 && num <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (num > 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Некорректно ввод");
        }
    }
}
