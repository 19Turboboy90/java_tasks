package ru.zharinov.tasks.basic_exercises.task_list_2;

import java.util.Scanner;

/*
Напишите программу на Java для подсчета букв, пробелов, чисел и других символов входной строки.
Ожидаемый результат

Строка: Aa kiu, я swd skieo 236587. GH kiu: sieo ?? 25,33
письмо: 23
пространство: 10
номер: 10
другое: 6
 */
public class Task38 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String line = console.nextLine();
        System.out.println(getInfo(line));
    }

    private static String getInfo(String line) {
        int countSpace = 0;
        int countLetter = 0;
        int countDigit = 0;
        int countOther = 0;
        char temp;
        for (int i = 0; i < line.length(); i++) {
            temp = line.charAt(i);
            if (Character.isDigit(temp)) {
                countDigit++;
            } else if (Character.isLetter(temp)) {
                countLetter++;
            } else if (Character.isSpaceChar(temp)) {
                countSpace++;
            } else {
                countOther++;
            }
        }
        return "письмо: " + countLetter + "\nпространство: " + countSpace +
                "\nномер: " + countDigit + "\nдругое: " + countOther;
    }
}
