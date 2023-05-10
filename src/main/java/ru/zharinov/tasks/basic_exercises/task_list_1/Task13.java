package ru.zharinov.tasks.basic_exercises.task_list_1;

/*
Напишите Java-программу для печати площади и периметра прямоугольника. Перейти к редактору
Тестовые данные:
Ширина = 5,5 Высота = 8,5

Ожидаемый результат
Площадь 5,6 * 8,5 = 47,60
Периметр 2 * (5,6 + 8,5) = 28,20
 */
public class Task13 {
    public static void main(String[] args) {
        float height = 8.5f;
        float width = 5.6f;
        float perimeterRectangle = 2 * (height + width);
        float squareRectangle = height * width;
        System.out.println("square areas = " + squareRectangle);
        System.out.println("perimeter rectangle = " + perimeterRectangle);
    }
}
