package ru.zharinov.tasks.basic_exercises.task_list_5;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

/*
Что нужно сделать
1. Напишите программу, которая будет работать как телефонная книга:
•	Если пишем новое имя, программа просит ввести номер телефона и запоминает его.
Если новый номер телефона — просит ввести имя и также запоминает.
•	Если вводим существующее имя или номер телефона, программа выводит всю информацию о контакте.
•	При вводе команды LIST программа печатает в консоль список всех абонентов в алфавитном порядке с номерами.
2. Определяйте имя и телефон с помощью регулярных выражений.
3. Подумайте, что выбрать в качестве ключа и значения для Map, выберите лучший вариант по вашему мнению.
Опишите, какие минусы и плюсы видите в вашем выборе.
 */
public class Task_89 {
    private static final Pattern phone = Pattern.compile("^((\\+7|7|8)+([0-9]){10})$");
    public static final Pattern name = Pattern.compile("^[а-яА-ЯёЁa-zA-Z]+ [а-яА-ЯёЁa-zA-Z]+ ?[а-яА-ЯёЁa-zA-Z]+$");
    private static boolean exit = true;

    public static void main(String[] args) {
        Map<String, String> phoneBook = new TreeMap<>();

        while (exit) {
            System.out.println("Введите контактные данные или LIST для отображения всех контактов:");
            Scanner console = new Scanner(System.in);
            var word = console.nextLine();
            if (phoneBook.containsKey(word) || phoneBook.containsValue(word)) {
                System.out.print("Вы ввели существующий ФИО или номер телефона: ");
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                    if (entry.getKey().equals(word) || entry.getValue().equals(word))
                        System.out.println(entry.getKey() + " " + entry.getValue());
                }
            } else {
                if (word.matches(name.pattern())) {
                    System.out.print("Введите номер телефона: ");
                    var phone = console.nextLine();
                    phoneBook.put(word, phone);
                } else if (word.matches(phone.pattern())) {
                    System.out.print("Введите имя пользователя: ");
                    var name = console.nextLine();
                    phoneBook.put(name, word);
                } else if (word.equals("LIST")) {
                    if (phoneBook.isEmpty()) {
                        System.out.println("Телефонная книга пуста.");
                    } else {
                        phoneBook.forEach((k, v) -> System.out.println("ФИО: " + k + ". телефон: " + v));
                    }
                } else if (word.equals("exit")) {
                    exit = false;
                } else {
                    System.out.println("Что-то пошло не так. Попробуйте снова");
                }
            }
        }
    }
}

