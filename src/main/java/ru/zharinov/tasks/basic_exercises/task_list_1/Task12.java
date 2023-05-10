package ru.zharinov.tasks.basic_exercises.task_list_1;

import java.util.Scanner;

/*
Напишите программу на Java, которая принимает три числа в качестве входных данных для вычисления и печати среднего числа.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("enter the first number: ");
        double number1 = console.nextDouble();
        System.out.print("enter the second number: ");
        double number2 = console.nextDouble();
        System.out.print("enter the third number: ");
        double number3 = console.nextDouble();
        double result = (number1 + number2 + number3) / 3;
        System.out.print("arithmetic mean = " + result);

    }
}
