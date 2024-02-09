package ru.zharinov.tasks.task_from_course.lecture_1;

import ru.zharinov.tasks.task_from_course.lecture_1.animal.Animal;
import ru.zharinov.tasks.task_from_course.lecture_1.animal.Dog;
import ru.zharinov.tasks.task_from_course.lecture_1.animal.HomeCat;
import ru.zharinov.tasks.task_from_course.lecture_1.animal.Tiger;

/*
Практическое задание
1. Создать классы Собака, Домашний Кот, Тигр, Животное (можете добавить два-три своих
класса).
2. Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
препятствия.
3. У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет
печать в консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
проплыть.
5. * Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", 5);
        HomeCat homeCat = new HomeCat("Barsik", 3);
        Tiger tiger = new Tiger("Tigro", 10);

        Animal[] animals = {dog,homeCat,tiger};
        for (Animal animal : animals) {
            animal.run(600);
            animal.swim(9);
        }

        dog.amount();
    }
}
