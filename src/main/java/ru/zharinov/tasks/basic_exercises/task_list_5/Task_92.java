package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.Scanner;

/*
Pell. Pell numbers Числа Пелля задаются следующим соотношением:

На вход подается число n (0 <= n <= 30), необходимо распечатать n-e число Пелля
Пример:
Ввод:
5
Вывод:
29

 */
public class Task_92 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = console.nextInt();
        System.out.println(pellNumber(n));
    }

    public static long pellNumber(int n) {
        long c = 0, p = 1, cn;
        for (int i = 1; i <= n; i++) {
            cn = p + 2 * c;
            p = c;
            c = cn;
        }
        return c;
    }
}
