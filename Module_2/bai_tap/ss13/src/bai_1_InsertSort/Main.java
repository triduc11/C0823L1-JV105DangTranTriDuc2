package bai_1_InsertSort;

public class Main {
    static int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
