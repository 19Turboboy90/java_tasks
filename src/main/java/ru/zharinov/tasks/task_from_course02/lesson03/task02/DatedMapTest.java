package ru.zharinov.tasks.task_from_course02.lesson03.task02;

public class DatedMapTest {
    public static void main(String[] args) {
        DatedMapImpl datedMap = new DatedMapImpl();
        datedMap.put("1", "1");
        var keyLastInsertionDate1 = datedMap.getKeyLastInsertionDate("1");
        System.out.println(keyLastInsertionDate1);

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        datedMap.put("2", "2");
        datedMap.put("3", "3");
        var keyLastInsertionDate2 = datedMap.getKeyLastInsertionDate("2");

        System.out.println(keyLastInsertionDate2);
    }
}
