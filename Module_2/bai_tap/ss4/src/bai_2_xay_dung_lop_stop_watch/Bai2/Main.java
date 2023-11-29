package bai_2_xay_dung_lop_stop_watch.Bai2;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10000);
        StopWatch stopWatch = new StopWatch();

        stopWatch.star();
        selectionSort(arr);
        stopWatch.end();

        System.out.println("Thoi gian thuc thi thuat toan la: " + stopWatch.getElapsedTime() + " milisecond giây");
    }

    // selection sort , de sap xep tang dan
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

    // tao random cho 10000 so
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
}
