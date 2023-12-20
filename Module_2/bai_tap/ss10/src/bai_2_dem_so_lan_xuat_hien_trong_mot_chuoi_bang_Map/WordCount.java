package bai_2_dem_so_lan_xuat_hien_trong_mot_chuoi_bang_Map;

import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi từ: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split("\\s+");

        for (String s : words) {
            String key = s.toLowerCase();
            if (wordMap.containsKey(key)) {
                int count = wordMap.get(key);
                wordMap.put(key, count + 1);
            } else {
                wordMap.put(key, 1);
            }
        }
        System.out.println("Kết quả:");
        for (String word : wordMap.keySet()) {
            int count = wordMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
