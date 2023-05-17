package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/*
Напишите программу на Java, чтобы перечислить доступные наборы символов в объектах charset.
Ожидаемый результат

Список доступных наборов символов:
Big5
Big5-HKSCS
CESU-8
EUC-JP
EUC-KR
GB18030
GB2312
GBK

...

х-SJIS_0213
х-UTF-16LE-ВОМ
X-UTF-32BE-BOM
X-UTF-32LE-BOM
Рентгеновские окна-50220
Рентгеновские окна-50221
Рентгеновские окна-874
Рентгеновские окна-949
Рентгеновские окна-950
Рентгеновские окна-iso2022jp
 */
public class Task40 {
    public static void main(String[] args) {
        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();
        System.out.println("List of available character sets:");
        for (String s : stringCharsetSortedMap.keySet()) {
            System.out.println(s);
        }
    }
}
