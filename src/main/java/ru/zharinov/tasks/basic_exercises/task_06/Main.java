package ru.zharinov.tasks.basic_exercises.task_06;

import java.util.Scanner;

/*
Напишите Java-программу для печати суммы (сложения), умножения, вычитания, деления и остатка двух чисел.
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int number1 = console.nextInt();
        System.out.println("enter the second number: ");
        int number2 = console.nextInt();
        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int remains = number1 % number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " % " + number2 + " = " + remains);
    }
}
