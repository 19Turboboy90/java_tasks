package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для вычисления площади многоугольника.
Площадь многоугольника = (n * s ^ 2) / (4 * tan (π / n))
где n - это n-сторонний многоугольник, а s - длина стороны
Входные данные:
Введите количество сторон на многоугольнике: 7
Введите длину одной из сторон: 6
Ожидаемый результат

Площадь составляет: 130.82084798405722
 */
public class Task35 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of sides on the polygon: ");
        double numberOfSides = console.nextDouble();
        System.out.print("Enter the length of one of the sides: ");
        double length = console.nextDouble();
        double result = (numberOfSides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
        System.out.println("The area is: " + result);
    }
}
