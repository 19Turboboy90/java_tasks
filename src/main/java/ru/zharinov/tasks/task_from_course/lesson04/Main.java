package ru.zharinov.tasks.task_from_course.lesson04;

import ru.zharinov.tasks.task_from_course.lesson04.fruits.Apple;
import ru.zharinov.tasks.task_from_course.lesson04.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого
ссылочного типа).
2. Написать метод, который преобразует массив в ArrayList.
3. Задача:
a. Даны классы Fruit -> Apple, Orange.
b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
c. Для хранения фруктов внутри коробки можно использовать ArrayList.
d. Написать метод getWeight(), который высчитывает вес коробки. Задать вес одного
фрукта и их количество: вес яблока — 1.0f, апельсина — 1.5f (единицы измерения не
важны).
e. Внутри класса Box написать метод Compare, который позволяет сравнить текущую
коробку с той, которую подадут в Compare в качестве параметра. True, если их массы
равны, False — в противном случае. Можно сравнивать коробки с яблоками и
апельсинами.
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
объекты, которые были в первой.
g. Не забываем про метод добавления фрукта в коробку.
 */
public class Main {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        FruitBox<Orange> orangeBox = new FruitBox<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        FruitBox<Apple> newAppleBox = new FruitBox<>();

        System.out.println("Вес всех яблок коробке: " + appleBox.getWeight());
        System.out.println("Вес всех апельсинов коробке: " + orangeBox.getWeight());
        System.out.println(appleBox.compareTo(orangeBox));
        System.out.println(appleBox.getFruitList());
        System.out.println(newAppleBox.getFruitList());
        appleBox.transfer(newAppleBox);
        System.out.println(appleBox.getFruitList());
        System.out.println(newAppleBox.getFruitList());

        String[] array = new String[]{"A", "B", "C", "D", "E", "F", "G"};
        swap(array[0], array[array.length - 1], array);
        System.out.println(convertToList(array));
    }

    private static <T> void swap(T element1, T element2, Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element1)) {
                array[i] = element2;
                continue;
            }
            if (array[i].equals(element2)) {
                array[i] = element1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
