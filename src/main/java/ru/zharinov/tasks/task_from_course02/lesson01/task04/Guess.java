package ru.zharinov.tasks.task_from_course02.lesson01.task04;

import java.util.Random;
import java.util.Scanner;

/*
Guess. Игра угадайка. При запуске программа загадывает число от 1 до 99 (включительно)
и дает пользователю 10 попыток отгадать. Далее пользователь начинает вводить число.
И тут возможен один из следующих вариантов:
- Пользователь отгадал число. В таком случае выводится строка
“Ты угадал с N попытки”, где N - номер текущей попытки пользователя
- Пользователь ввел число, меньше загаданного. В таком случае выводится сообщение “Мое число меньше!
У тебя осталось M попыток” где M - количество оставшихся попыток
- Пользователь ввел число, больше загаданного. В таком случае выводится сообщение “Мое число больше!
У тебя осталось M попыток” где M - количество оставшихся попыток
- У пользователя закончились попытки и число не было угадано. В таком случае выводится сообщение “Ты ну угадал”

Получить случайный элемент от 1 до 99 (включительно):
int number = new Random().nextInt(99) + 1;

public class Guess {
 public static void main(String[] args) throws Exception {
   int number = new Random().nextInt(100); // здесь загадывается число от 1 до 99
   int maxAttempts = 10; // здесь задается количество попыток
   System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
   // ваш код здесь
 }
}
 */
public class Guess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var randomNumber = new Random().nextInt(100);
        int maxAttempts = 10;
        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");
        for (int i = 1; i <= 10; i++) {
            System.out.print("У тебя осталось " + maxAttempts + " попыток угадать. Введите число: ");
            int number = console.nextInt();
            if (number < randomNumber) {
                System.out.println("Твое число меньше! ");
            } else if (number > randomNumber) {
                System.out.println("Твое число больше! ");
            } else {
                System.out.println("Ты угадал с " + i + " попытки!!!");
                break;
            }
            maxAttempts--;
        }
        System.out.println("Попыток больше нет!!!");
    }
}
