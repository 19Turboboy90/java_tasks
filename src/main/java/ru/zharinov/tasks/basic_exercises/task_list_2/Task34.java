package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для вычисления площади шестиугольника.
Площадь шестиугольника = (6 * s ^ 2) / (4 * tangent (π / 6))
где s - длина стороны
Входные данные:
Введите длину стороны шестиугольника: 6
Ожидаемый результат

Площадь шестиугольника: 93.53074360871938
 */
public class Task34 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the length of the hexagon side: ");
        double number = console.nextDouble();
        double result = (6 * Math.pow(number, 2) / (4 * Math.tan(Math.PI / 6)));
        System.out.println("The area of the hexagon: " + result);
    }
}
