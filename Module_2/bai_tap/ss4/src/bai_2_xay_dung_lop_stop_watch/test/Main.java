package bai_2_xay_dung_lop_stop_watch.test;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000);
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thời gian thực thi : " + stopWatch.getElapsedTime() + " milisecond");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

}
