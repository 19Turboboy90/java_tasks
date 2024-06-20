package ru.zharinov.tasks.task_from_course01.lesson07;

import java.util.concurrent.Semaphore;

import static ru.zharinov.tasks.task_from_course01.lesson07.Main.CARS_COUNT;

public class Tunnel extends Stage {
    private Semaphore semaphore;

    public Tunnel() {
        this.semaphore = new Semaphore(CARS_COUNT / 2);
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            if (!semaphore.tryAcquire()) {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                semaphore.acquire();
            }
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
            System.out.println(c.getName() + " закончил этап: " + description);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
