package ru.zharinov.tasks.basic_exercises.task_09;

/*
Напишите программу на Java для вычисления указанных выражений и распечатки вывода.

Тестовые данные:
((25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5))
Ожидаемый результат
+2,138888888888889
 */
public class Main {
    public static void main(String[] args) {
        double num1 = 25.5;
        double num2 = 3.5;
        double num3 = 40.5;
        double num4 = 4.5;
        double result = (num1 * num2 - num2 * num2) / (num3 - num4);
        System.out.println(result);
    }
}
