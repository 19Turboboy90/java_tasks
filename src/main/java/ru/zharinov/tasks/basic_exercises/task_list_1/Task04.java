package ru.zharinov.tasks.basic_exercises.task_list_1;

/*
Напишите Java-программу для печати результата следующих операций.

Тестовые данные:
а. -5 + 8 * 6
б. (55 + 9)% 9
с. 20 + -3 * 5/8
д. 5 + 15/3 * 2 - 8% 3
Ожидаемый результат :
43
1
19
13
 */
public class Task04 {
    public static void main(String[] args) {
        int result1 = -5 + 8 * 6;
        int result2 = (55 + 9) % 9;
        int result3 = 20 + -3 * 5 / 8;
        int result4 = 5 + 15 / 3 - 8 % 3;
        System.out.println("the result of the product = " + result1);
        System.out.println("the result of the product = " + result2);
        System.out.println("the result of the product = " + result3);
        System.out.println("the result of the product = " + result4);
    }
}
