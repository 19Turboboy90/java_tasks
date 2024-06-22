package ru.zharinov.tasks.task_from_course02.lesson03.task01;

import java.util.HashMap;
import java.util.Map;

public class TransliteratorImpl implements Transliterator {
    private final Map<Character, String> map = new HashMap<>();
    private final char[] cyrillicAlphabet = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л',
            'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ы', 'Ь', 'Ъ', 'Э', 'Ю', 'Я'};
    private final String[] latinAlphabet = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M",
            "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "Y", "", "IE", "E", "IU", "IA"};

    {
        for (int i = 0; i < cyrillicAlphabet.length; i++) {
            map.put(cyrillicAlphabet[i], latinAlphabet[i]);
        }
    }

    @Override
    public String transliterate(String source) {
        if (source.equals("")) return "";
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : source.toCharArray()) {
            stringBuilder.append(map.getOrDefault(c, String.valueOf(c)));
        }
        return stringBuilder.toString();
    }
}