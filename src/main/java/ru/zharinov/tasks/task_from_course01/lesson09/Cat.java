package ru.zharinov.tasks.task_from_course01.lesson09;

import ru.zharinov.tasks.task_from_course01.lesson09.annotation.Column;
import ru.zharinov.tasks.task_from_course01.lesson09.annotation.Table;

@Table(title = "cats")
public class Cat {
    @Column
    int id;
    @Column
    String name;
    @Column
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
