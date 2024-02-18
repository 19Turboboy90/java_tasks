package ru.zharinov.tasks.task_from_course.lesson04;

import ru.zharinov.tasks.task_from_course.lesson04.fruits.Fruit;

import java.util.ArrayList;

public class FruitBox<F extends Fruit> {
    private ArrayList<F> fruitList;

    public FruitBox() {
        this.fruitList = new ArrayList<>();
    }

    public double getWeight() {
        if (fruitList.size() == 0) {
            return 0.0;
        }
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public void addFruit(F fruit) {
        fruitList.add(fruit);
    }

    public boolean compareTo(FruitBox<?> o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.00001;
    }

    public void transfer(FruitBox<? super F> newBox) {
        newBox.fruitList.addAll(this.fruitList);
        this.fruitList.clear();
    }

    public ArrayList<F> getFruitList() {
        return fruitList;
    }
}
