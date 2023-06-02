package Homework_3;
import java.util.Arrays;
import java.util.Random;
public class Task_1 {


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
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}