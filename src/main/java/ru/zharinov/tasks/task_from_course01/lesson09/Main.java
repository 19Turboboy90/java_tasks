package ru.zharinov.tasks.task_from_course01.lesson09;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Processor.connect();
            Processor.buildTable(Cat.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            Processor.disconnect();
        }

    }
}