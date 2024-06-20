package ru.zharinov.tasks.task_from_course01.lesson03;

import ru.zharinov.tasks.task_from_course01.lesson03.exceptions.MyArrayDataException;
import ru.zharinov.tasks.task_from_course01.lesson03.exceptions.MyArraySizeException;
import ru.zharinov.tasks.task_from_course01.lesson03.exceptions.MyException;

import java.util.regex.Pattern;

/*
1. Создайте исключения: MyArraySizeException (неправильный размер массива), и
MyArrayDataException (
);
2. Напишите метод, на вход которого подаётся двумерный строковый массив (String[][]) размером
4×4. При подаче массива другого размера необходимо бросить исключение
MyArraySizeException.

3. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. Расчет
данных для этой матрицы прекращается.
4. В методе main() нужно вызвать полученный метод, обработать возможные исключения
MySizeArrayException и MyArrayDataException и вывести результат расчёта.
Заметка: для преобразования строки в число можно использовать метод класса Integer:
Integer.valueOf("1")

 */
public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма чисел двумерного массива = " + checkArray(array));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int checkArray(String[][] array) {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Неправильный размер массива. Должен быть 4x4");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException("Неправильный размер массива. Должен быть 4x4");
                }
                if (!(Pattern.matches("\\d+", array[j][i]))) {
                    throw new MyArrayDataException(i, j, array);
                } else {
                    sum += Integer.parseInt(array[j][i]);
                }
            }
        }
        return sum;
    }
}
