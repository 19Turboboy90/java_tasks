package ru.zharinov.tasks.task_from_course02.lesson02.task04;

public class StatsAccumulatorImpl implements StatsAccumulator {
    private int minNumber;
    private int maxNumber;
    private double avgNumber;
    private int count;


    @Override
    public void add(int value) {
        if (value > maxNumber) {
            maxNumber = value;
        }
        if (value < minNumber) {
            minNumber = value;
        }
        this.avgNumber += value;
        this.count++;
    }

    @Override
    public int getMin() {
        return this.minNumber;
    }

    @Override
    public int getMax() {
        return this.maxNumber;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public Double getAvg() {
        return this.avgNumber / count;
    }
}
