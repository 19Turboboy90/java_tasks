package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Напишите программу на Java для вычисления суммы первых 100 простых чисел.
Пример вывода:

Сумма первых 100 простых чисел: 1046
 */
public class Task_66 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = console.nextInt();
        System.out.println("sum of primes up to " + num + ": " + getFirstPrimes(num));
    }

    private static int getFirstPrimes(int max) {
//        boolean[] isPrime = new boolean[max];
//        Arrays.fill(isPrime, true);
//
//        for (int i = 2; i * i < max; i++) {
//            if (isPrime[i]) {
//                for (int j = 2 * i; j < max; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            if (is_Prime(i)) {
                primes.add(i);
            }
        }
        return sumPrimeNumbers(primes);
    }

    private static int sumPrimeNumbers(List<Integer> primes) {
        int result = 0;
        for (Integer prime : primes) {
            result += prime;
        }
        return result;
    }

    //Проверка числа - составное или простое
    private static boolean is_Prime(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
