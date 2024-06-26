package ru.zharinov.tasks.task_from_course02.lesson03.task03;

import java.io.File;
import java.io.IOException;

/*
Org Structure
Структура организации записана в виде строк в CSV файле. CSV - файл - это простой текстовый файл, содержащий строки.
Каждая строка представляет собой одну запись (объект). Поля объекта разделены специальным символом ;.
Первая строка файла содержит поля имена полей, все дальнейшие сроки содержат непосредственно данные

Пример:
id;boss_id;name;position
1;;Иван Иванович;Генеральный директор
2;1;Крокодилова Людмила Петровна;Главный бухгалтер
3;2;Галочка;Бухгалтер
4;1;Сидоров Василий Васильевич;Исполнительный директор
5;1;Зайцев Валерий Петрович;Директор по ИТ
6;5;Петя;Программист

В файле поле id обозначает уникальный идентификатор сотрудника, boss_id идентификатор начальника, name - имя сотрудника,
position - должность. Таким образом, данные в файле описывают следующую иерархию сотрудников. Необходимо написать
программу, получает на вход CSV файл формата, описанного выше и формирует структуру объектов класса

Решение оформить в виде реализации следующего интерфейса
public interface OrgStructureParser {
public Employee parseStructure(File csvFile) throws IOException;
};
Метод parseStructure должен считывать данные из файла и возвращать ссылку на Босса (Генерального директора) -
сотрудника, атрибут boss_id которого не задан. Cчитать, что такой сотрудник в файле ровно один. P.S. subordinates -
список прямых подчиненных
 */
public class OrgStructureTest {
    public static void main(String[] args) {
        OrgStructureImpl orgStructure = new OrgStructureImpl();
        try {
            var employeeList = orgStructure.parseStructure(
                    new File("src/main/java/ru/zharinov/tasks/task_from_course02/lesson03/task03/employees.csv"));
            System.out.println(employeeList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
