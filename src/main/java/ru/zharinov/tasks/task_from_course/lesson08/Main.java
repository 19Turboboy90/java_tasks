package ru.zharinov.tasks.task_from_course.lesson08;

/*
1. Создайте массив с набором слов, и с помощью Stream API найдите наиболее часто
встречающееся;
2. Создайте массив объектов типа Сотрудник (с полями Имя, Возраст, Зарплата) и вычислите
среднюю зарплату сотрудника;
3. Напишите метод, способный найти в массиве сотрудников из п. 2 найдите N самых старших
сотрудников и отпечатает в консоль сообщение вида “N самых старших сотрудников зовут:
имя1, имя2, имяN;”.
 */

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Ivan", 22, 30000),
                new Employee("Sergey", 35, 65000),
                new Employee("Petr", 18, 15000),
                new Employee("Svetlana", 40, 150000),
                new Employee("Evgeniy", 43, 280000)};
//        findPopularElement("Иван", "Сергей", "Петр", "Иван", "Иван", "Сергей", "Петр", "Иван");
//        findAvgSalary(employees);
        findOldEmployees(3, employees);
    }

    private static void findPopularElement(String... arr) {
        var result = Arrays.stream(arr)
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println(result);
    }

    private static void findAvgSalary(Employee... arr) {
        var collect = Arrays.stream(arr)
                .collect(Collectors.averagingInt(Employee::getSalary));
        System.out.println("Средняя зарплата работников: " + collect);
    }

    private static void findOldEmployees(int age, Employee... arr) {
        var result = Arrays.stream(arr)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(age)
                .map(Employee::getName)
                .collect(Collectors.joining(", ", age + " самых старших сотрудника ", "."));
        System.out.println(result);
    }
}
