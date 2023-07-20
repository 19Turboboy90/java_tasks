package ru.zharinov.tasks.basic_exercises.task_list_4;

import java.util.Arrays;

/*
Напишите программу на Java, чтобы найти число, которое встречается только один раз в данном массиве целых чисел,
все числа встречаются дважды.
Source Array: [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 появляется только один раз
 */
public class Task_79 {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 20, 30, 40, 40, 50, 30};
        System.out.println(getSingleNumber(array));
    }

    public static int getSingleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
