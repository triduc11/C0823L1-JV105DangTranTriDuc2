package bai_2_cai_dat_thuat_toan_nhi_phan_bang_de_quy;


import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(Integer.parseInt(scanner.nextLine()));
        }
        Collections.sort(array);
        System.out.println("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();
        int result = binarySearch(array, 0, n - 1, value);
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng.");
        } else {
            System.out.println("Giá trị được tìm thấy tại vị trí: " + result);
        }
    }

    public static int binarySearch(ArrayList<Integer> array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (array.get(middle) == value) {
                return middle;
            }
            if (value > array.get(middle)) {
                return binarySearch(array, middle + 1, right, value);
            }
            return binarySearch(array, left, middle - 1, value);
        }
        return -1;
    }
}

