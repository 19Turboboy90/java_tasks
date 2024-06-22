package ru.zharinov.tasks.task_from_course02.lesson03.task01;

/*
Реализовать интерфейс Transliterator
public interface Transliterator {
String transliterate(String source);
}
Метод transliterate должен выполнять транслитерацию входной строки в выходную, то
есть заменять каждый символ кириллицы на соответствующую группу символов
латиницы. Каждый символ кириллицы, имеющийся во входной строке входит в нее в
верхнем регистре.
public class TransliteratorTest {
public static void main(String[] args) {
Transliterator transliterator = new TransliteratorImpl();
String res = transliterator
.transliterate("HELLO! ПРИВЕТ! Go, boy!");
System.out.println(res);
}
}
> HELLO! PRIVET! Go, boy
 */
public class TransliteratorTest {
    public static void main(String[] args) {
        Transliterator transliterator = new TransliteratorImpl();
        String res = transliterator
                .transliterate("HELLO! ПРИВЕТ! Go, boy!");
        System.out.println(res);
    }
}
