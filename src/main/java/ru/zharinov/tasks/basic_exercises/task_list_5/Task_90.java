package ru.zharinov.tasks.basic_exercises.task_list_5;

import java.util.*;

/*
1. Напишите генератор «красивых» автомобильных номеров и методы поиска элементов в коллекциях:
•	прямым перебором по ArrayList,
•	бинарным поиском по сортированному ArrayList,
•	поиском в HashSet,
•	поиском в TreeSet.
2. Измерьте и сравните длительность каждого метода поиска.
Формат вывода результатов поиска:
Поиск перебором: номер найден/не найден, поиск занял 34нс
Бинарный поиск: номер найден/не найден, поиск занял 34нс
Поиск в HashSet: номер найден/не найден, поиск занял 34нс
Поиск в TreeSet: номер найден/не найден, поиск занял 34нс
3. Напишите в форме ответа, какой поиск — самый быстрый, а какой — самый медленный.
В видео Поиск и сортировка неточно указана оценка результата работы метода бинарного поиска Collections.binarySearch().
Метод возвращает int, если возвращаемое значение больше или равно нулю — это означает, что элемент найден.
Если возвращаемое значение int меньше нуля — элемент в коллекции не найден.

Рекомендации
•	Сортировка не входит в учёт времени для бинарного поиска.
•	Для детального сравнения методов поиска используйте время в наносекундах:
     System.nanoTime()
•	Используйте правила генерации номеров для получения более 2 млн номеров:
XYZ — различные буквы, N — цифры, R — регион (от 01 до 199);
XNNNYZR — пример, A111BC197, Y777HC66,
таким образом, количество номер будет достаточно для оценки времени поиска даже в миллисекундах.
 */
public class Task_90 {
    private static final String[] words = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    private static List<String> listNumbers = new ArrayList<>();
    private static Set<String> hashSetMNumbers = new HashSet<>();
    private static Set<String> treeSetNumbers = new TreeSet<>();

    private static final Scanner console = new Scanner(System.in);

    private static final Random random = new Random();

    public static void main(String[] args) {

        addedCollections();
        for (String listNumber : listNumbers) {
            System.out.println(listNumber);
        }

        while (true) {
            System.out.println("Введите номер машины в формате А111АА111");
            String carNumber = console.nextLine();
            linSearch(carNumber);
            binarySearch(carNumber);
            searchToHashSet(carNumber);
            searchToTreeSet(carNumber);
        }

    }

    private static void searchToHashSet(String carNumber) {
        String result = "";
        var before = System.nanoTime();
        for (String listNumber : hashSetMNumbers) {
            if (carNumber.equals(listNumber)) {
                result = " найден, ";
                break;
            } else {
                result = " не найден, ";
            }
        }
        var after = System.nanoTime();
        System.out.println("Поиск в HashSet: : номер " + carNumber + result + "поиск занял " + (after - before) + "нс");
    }

    private static void searchToTreeSet(String carNumber) {
        String result = "";
        var before = System.nanoTime();
        for (String listNumber : treeSetNumbers) {
            if (carNumber.equals(listNumber)) {
                result = " найден, ";
                break;
            } else {
                result = " не найден, ";
            }
        }
        var after = System.nanoTime();
        System.out.println("Поиск в TreeSet: номер " + carNumber + result + "поиск занял " + (after - before) + "нс");
    }

    private static void binarySearch(String carNumber) {
        String result;
        Collections.sort(listNumbers);
        var before = System.nanoTime();
        var i = Collections.binarySearch(listNumbers, carNumber);
        if (i >= 0) {
            result = " найден, ";
        } else {
            result = " не найден, ";
        }
        var after = System.nanoTime();
        System.out.println("Бинарный поиск:  номер " + carNumber + result + "поиск занял " + (after - before) + "нс");
    }

    private static void linSearch(String carNumber) {
        String result = "";
        var before = System.nanoTime();
        for (String listNumber : listNumbers) {
            if (carNumber.equals(listNumber)) {
                result = " найден, ";
                break;
            } else {
                result = " не найден, ";
            }
        }
        var after = System.nanoTime();
        System.out.println("Поиск перебором: номер " + carNumber + result + "поиск занял " + (after - before) + "нс");
    }


    //Генерация номера
    private static StringBuilder randomNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(words[random.nextInt(words.length)])
                .append(random.nextInt(900) + 100)
                .append(words[random.nextInt(words.length)])
                .append(words[random.nextInt(words.length)])
                .append(random.nextInt(199) + 1);
    }


    //Добавление авто номеров в коллекции
    private static void addedCollections() {
        for (int i = 0; i <= 2_000_000; i++) {
            listNumbers.add(randomNumber().toString());
        }
        hashSetMNumbers.addAll(listNumbers);
        treeSetNumbers.addAll(listNumbers);
    }
}
