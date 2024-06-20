package ru.zharinov.tasks.task_from_course01.lesson05;

import ru.zharinov.tasks.task_from_course01.lesson05.directory.PhoneDirectory;

import java.util.*;

/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно
добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
справочника.

 */
public class Main {
    public static void main(String[] args) {
        String[] array = {"доход", " костюм", "строительство", "слава", "дочка", "помощь", "практика", "защита",
                "охрана", "мероприятие", "костюм", "воля", "князь", "костюм", "соответствие", "строительство", "часть",
                "помощь", "масштаб", "кухня"};
//        findUniqueElements(array);
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Иванов", "+79991111111");
        phoneDirectory.add("Иванов", "+79992222222");
        phoneDirectory.add("Петров", "+79993333333");
        phoneDirectory.add("Сидоров", "+79994444444");
        phoneDirectory.add("Сергеев", "+79995555555");
        phoneDirectory.add("Сергеев", "+79996666666");
        phoneDirectory.add("Богданов", "+79997777777");
        phoneDirectory.add("Сержантов", "+79998888888");
        phoneDirectory.add("Майоров", "+79999999999");

        System.out.println(phoneDirectory.getNumberPhone("Иванов"));
        System.out.println("--------------------");
        System.out.println(phoneDirectory.getNumberPhone("Майоров"));
    }

    private static void findUniqueElements(String... array) {
        Map<String, Integer> hm = new HashMap<>();
        for (String str : array) {
            hm.put(str, Collections.frequency(Arrays.asList(array), str));
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
    }
}
