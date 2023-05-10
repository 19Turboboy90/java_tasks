package ru.zharinov.tasks.basic_exercises.task_10;

/*
Напишите программу на Java для вычисления указанной формулы.

Указанная формула:
4,0 * (1 - (1,0 / 3) + (1,0 / 5) - (1,0 / 7) + (1,0 / 9) - (1,0 / 11))
Ожидаемый результат
2,9760461760461765
 */
public class Main {
    public static void main(String[] args) {
        double formula = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(formula);
    }
}
