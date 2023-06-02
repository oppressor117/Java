package Homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Task_3 {
    public static void mergeSort(int[] arr) {
        if (arr == null) {
            return;
        }
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
            int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);
            mergeSort(leftArr);
            mergeSort(rightArr);
            merge(arr, leftArr, rightArr);
        }
    }
    
    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        // Нахождение минимального и максимального значения
        int min = Collections.min(list);
        int max = Collections.max(list);

        // Нахождение среднего арифметического значения
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double avg = (double)sum / list.size();

        // Вывод результатов
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + avg);

        

    }
}