package ru.zharinov.tasks.task_from_course.lesson01;

import ru.zharinov.tasks.task_from_course.lesson01.animals.Animal;
import ru.zharinov.tasks.task_from_course.lesson01.animals.Dog;
import ru.zharinov.tasks.task_from_course.lesson01.animals.HomeCat;
import ru.zharinov.tasks.task_from_course.lesson01.animals.Tiger;

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
        Dog dog = new Dog("Шарик", 100, 50);
        HomeCat homeCat = new HomeCat("Барсик", 50);
        Tiger tiger = new Tiger("Тигро", 500, 100);

        Animal[] animals = {dog, homeCat, tiger};
        for (Animal animal : animals) {
            animal.run(100);
            animal.swim(60);
        }
        System.out.println("Создано всего животных: " + Animal.count);
        System.out.println("Создано всего собак: " + Dog.count);
        System.out.println("Создано всего домашних котов: " + HomeCat.count);
        System.out.println("Создано всего тигров: " + Tiger.count);
    }
}
