package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
1.	Напишите программу, в которой будет храниться перечень адресов электронной почты. Адреса можно добавлять
через консоль командой ADD и печатать весь список командой LIST.
2.	Программа должна проверять корректность вводимых email’ов и печатать сообщение об ошибке при необходимости.
Принцип работы команд
•	LIST — выводит список электронных адресов.
•	ADD — проверяет и, если формат адреса верный, добавляет в множество.
•
Примеры команд
•	LIST
•	ADD hello@skillbox.ru
Команды вводятся одной строкой пользователем в консоль.

 */
public class Task_88 {
    public static void main(String[] args) {
        Set<String> setEmail = new TreeSet<>();
        boolean exit = true;
        Scanner console = new Scanner(System.in);

        while (exit) {
            System.out.println("Список команда:");

            System.out.println("LIST - список всех email.\nADD - добавить email.\n");
            System.out.print("Введите команду или exit для выхода: \n");

            String command = console.nextLine();

            switch (command) {
                case "LIST":
                    for (String s : setEmail) {
                        System.out.println(s);
                    }
                    System.out.println();
                    break;
                case "ADD":
                    boolean again = true;
                    while (again) {
                        System.out.print("Введите email: ");
                        String email = console.nextLine();
                        String regex = ".+@(yandex|mail|gmail)\\.(ru|com)";
                        if (email.matches(".+@(yandex|mail|gmail)\\.(ru|com)")) {
                            setEmail.add(email);
                            System.out.println("Email добавлен.\n");
                            again = false;
                        } else {
                            System.out.println("Что-то пошло не так. Попробуйте снова");
                        }
                    }
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    System.out.println("что-то пошло не так. Попробуйте снова");
            }
        }
    }
}
