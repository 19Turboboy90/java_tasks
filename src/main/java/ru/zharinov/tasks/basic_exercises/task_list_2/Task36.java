package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java, чтобы вычислить расстояние между двумя точками на поверхности земли.
Расстояние между двумя точками [(x1, y1) & (x2, y2)]
d = радиус * arccos (sin (x1) * sin (x2) + cos (x1) * cos (x2) * cos (y1 - y2))
Радиус земли r = 6371.01 Километров
Входные данные:
Введите широту координаты 1: 25
Введите долготу координаты 1: 35
Введите широту координаты 2: 35,5
Введите долготу координаты 2: 25,5
Ожидаемый результат

Расстояние между этими точками: 1480.0848451069087 км
 */
public class Task36 {
    private static final double RADIOS_OF_EARTH = 6371.01;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the latitude of the coordinate 1: ");
        double x1 = console.nextDouble();
        System.out.print("Enter the longitude of the coordinate 1: ");
        double y1 = console.nextDouble();
        System.out.print("Enter the latitude of the coordinate 2: ");
        double x2 = console.nextDouble();
        System.out.print("Enter the longitude of the coordinate 2: ");
        double y2 = console.nextDouble();
        System.out.println("The distance between these points: " + getDistance(x1, y1, x2, y2));
    }

    private static double getDistance(double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        return RADIOS_OF_EARTH * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }
}