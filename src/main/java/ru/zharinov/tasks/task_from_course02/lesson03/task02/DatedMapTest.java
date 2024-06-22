package ru.zharinov.tasks.task_from_course02.lesson03.task02;
/*
DatedMap - это структура данных, очень похожая на Map, но содержащая
дополнительную информацию: время добавления каждого ключа. При этом время
хранится только для тех ключей, которые присутствуют в Map.
Реализовать DatedMap путем реализации следующего интерфейса
public interface DatedMap {
void put(String key, String value);
String get(String key);
boolean containsKey(String key);
void remove(String key);
Set<String> keySet();
Date getKeyLastInsertionDate(String key);
}
Методы:
put. Помещает в map пару ключ и значение. Как видно из описания метода, ключ и
значение - это строки (семантика Map#put)
get. Возвращает значение, связанное с переданным в метод ключом. Если для
переданного ключа значение отсутствует - возвращается null (семантика Map#get)
containsKey. Метод, проверяющий, есть ли в map значение для данного ключа
(семантика Map#containsKey).
remove. Получая на вход ключ, удаляет из map ключ и значение, с ним связанное
(семантика Map#remove)
ketSet. Возвращает множество ключей, присутствующее в map (семантика
Map#keySet)
getKeyLastInsertionDate. Получая на вход ключ, проверяет, что для данного ключа
существует значение в map. Если существует - возвращает дату, когда оно было
добавлено. Если нет - возвращает null
В реализации данного класса можно использовать уже готовые структуры данных в
Java, такие как HashMap

 */
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
