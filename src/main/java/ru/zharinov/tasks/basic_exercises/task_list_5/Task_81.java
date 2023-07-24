package ru.zharinov.tasks.basic_exercises.task_list_5;

/*
Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значением.
 */

public class Task_81 {
    public static void main(String[] args) {
//                     0  1  2  3  4  5  6   7
        int[] array = {1, 2, 10, 5, 6, 4, 0, 3};
        System.out.println("min index = " + minIndexArray(array));
        System.out.println("max index = " + maxIndexArray(array));
        System.out.println(sumBetweenMinAndMaxValue(array));
    }


    private static int minIndexArray(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int maxIndexArray(int[] array) {
        int maxIndex = 0;
        int maxValue = array[maxIndex];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int sumBetweenMinAndMaxValue(int[] array) {
        int minIndex = minIndexArray(array);
        int maxIndex = maxIndexArray(array);
        if (minIndex > maxIndex) {
            int tmp = minIndex;
            minIndex = maxIndex;
            maxIndex = tmp;
        }
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += array[i];
        }
        return result;
    }
}