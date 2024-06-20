package ru.zharinov.tasks.oop.task_list_1.task07;

public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulatorImpl s = new StatsAccumulatorImpl();
        s.add(1);
        s.add(2);
        System.out.println(s.getAvg()); // 1.5 - среднее арифметическое элементов
        s.add(0);
        s.add(-1);
        System.out.println(s.getMin()); // 0 - минимальное из переданных значений
        s.add(3);
        s.add(8);
        s.add(10);
        System.out.println(s.getMax()); // 8 - максимальный из переданных
        System.out.println(s.getCount());
    }
}
