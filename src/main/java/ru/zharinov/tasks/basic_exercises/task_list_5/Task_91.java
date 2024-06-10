package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.Scanner;

/*
Задачи
●	Stars. Программе передается 3 параметра: количество строк, количество столбцов, произвольный символ.
Необходимо вывести фигуру, состоящую из заданного списка строк и заданного количества столбцов,
и каждый элемент в которой равен указанному символу.

Ввод: n m c
Вывод: фигура

Пример:
Ввод:
2 3 $
Вывод:
$ $ $
$ $ $

 */
public class Task_91 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int countRow = console.nextInt();
        System.out.print("Введите количество столбцов: ");
        int countColumn = console.nextInt();
        System.out.print("Введите произвольный символ: ");
        console.nextLine();
        String symbol = console.nextLine();
        for (int i = 0; i < countRow; i++) {
            for (int j = 0; j < countColumn; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
