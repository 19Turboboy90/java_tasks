package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
Разработайте список дел, который управляется командами в консоли. Команды: LIST, ADD, EDIT, DELETE.
Принцип работы команд:
•	LIST — выводит дела с их порядковыми номерами;
•	ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер;
•	EDIT — заменяет дело с указанным номером;
•	DELETE — удаляет.
•
Примеры команд
•	LIST
•	ADD Какое-то дело
•	ADD 4 Какое-то дело на четвёртом месте
•	EDIT 3 Новое название дела
•	DELETE 7
Команды вводятся одной строкой пользователем в консоль.
 */
public class Task_87 {
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Список команда:\n");

            System.out.println("LIST - список всех дел.\n" +
                    "ADD - добавить.\n" +
                    "EDIT - изменить.\n" +
                    "DELETE - удалить.\n");
            System.out.print("Введите команду или exit для выхода: ");
            String command = console.nextLine();

            switch (command) {
                case "LIST":
                    forEach(toDoList);
                    break;
                case "ADD":
                    add(toDoList, console);
                    break;
                case "EDIT":
                    update(toDoList, console);
                    break;
                case "DELETE":
                    delete(toDoList, console);
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    System.out.println("Что то пошло не так");
                    break;
            }
        }
    }

    private static void forEach(List<String> toDoList) {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + "-" + toDoList.get(i));
        }
    }

    private static void add(List<String> toDoList, Scanner console) {
        System.out.print("Введите дело: ");
        String add = console.nextLine();
        toDoList.add(add);
    }

    private static void update(List<String> toDoList, Scanner console) {
        System.out.print("Введите номер дела, которое нужно изменить: ");
        String updateIndex = console.nextLine();
        var s = toDoList.get(Integer.parseInt(updateIndex) - 1);
        toDoList.remove(s);
        System.out.print("Введите новое дело: ");
        String newCommand = console.nextLine();
        toDoList.add(Integer.parseInt(updateIndex) - 1, newCommand);
    }

    private static void delete(List<String> toDoList, Scanner console) {
        System.out.println("Введите номер дела, которое нужно удалить: ");
        String indexDelete = console.nextLine();
        System.out.println();
        toDoList.remove(Integer.parseInt(indexDelete) - 1);
    }
}
