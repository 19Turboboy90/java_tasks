package ru.zharinov.tasks.basic_exercises.task_list_4;

/*
Напишите программу на Java, которая перебирает целые числа от 1 до 100. Для кратных трех выведите «Fizz» вместо числа и
напечатайте «Buzz» для кратных пяти. Когда число делится на три и пять, выведите «fizz buzz».
 */
public class Task_78 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
