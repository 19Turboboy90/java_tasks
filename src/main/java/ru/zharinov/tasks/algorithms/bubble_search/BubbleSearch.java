package ru.zharinov.tasks.algorithms.bubble_search;

import java.util.Arrays;

public class BubbleSearch {
    public static void main(String[] args) {
        int[] array = new int[]{34, 3, 56, 27, 85, 25, 83, 66, 28, 57, 48};
        search1(array);
        search2(array);
        search3(array);
    }

    private static void search1(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void search2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void search3(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
