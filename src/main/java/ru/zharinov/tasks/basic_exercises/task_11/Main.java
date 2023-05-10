package ru.zharinov.tasks.basic_exercises.task_11;

/*
Напишите Java-программу для печати области и периметра круга.

Тестовые данные:
Радиус = 7,5
Ожидаемый результат
Периметр = 47.12388980384689
Площадь = 176.71458676442586
 */
public class Main {
    public static void main(String[] args) {
        double radius = 7.5;
        double pi = Math.PI;
        double squareOfCircle = pi * Math.pow(radius, 2);
        double perimeterOfCircle = 2 * pi * radius;
        System.out.println("area of the circle = " + squareOfCircle);
        System.out.println("perimeter of the circle = " + perimeterOfCircle);
    }
}
