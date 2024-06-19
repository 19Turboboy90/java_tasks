package ru.zharinov.tasks.oop.task_list_1.task05;

public class RateLimitedPrinter {
    private int interval;
    private long lastTime = System.currentTimeMillis();

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
//        currentTime
    }

    public void print(String message) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime == interval) {
            lastTime = System.currentTimeMillis();
            System.out.println(message);

        }
    }
}
