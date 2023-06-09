package ru.zharinov.tasks.basic_exercises.task_list_3;

import java.util.Scanner;

/*
Напишите программу на Java, которая будет использовать первую букву каждого слова в предложении.
Пример вывода:

Введите предложение: быстрая коричневая лиса перепрыгивает через ленивую собаку.
Быстрая Коричневая Лиса Перепрыгивает Через Ленивую Собаку.
 */
public class Task_58 {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        System.out.print("Enter the text: ");
//        String text = console.nextLine();
//        System.out.println(updateText(text));
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String upper_case_line = "";
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
    }

    private static String updateText(String text) {
        char[] arrChar = text.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrChar.length; i++) {
            if (i == 0) {
                result.append(String.valueOf(arrChar[i]).toUpperCase());
                i++;
            }
            if (' ' == arrChar[i]) {
                result.append(" ");
                result.append(String.valueOf(arrChar[i + 1]).toUpperCase());
                i++;
            } else {
                result.append(arrChar[i]);
            }
        }
        return result.toString();
    }
}
