package ru.zharinov.tasks.task_from_course02.lesson02.task02;

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
