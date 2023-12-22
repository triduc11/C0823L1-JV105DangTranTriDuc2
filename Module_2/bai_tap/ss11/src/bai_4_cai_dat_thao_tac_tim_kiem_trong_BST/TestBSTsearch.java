package bai_4_cai_dat_thao_tac_tim_kiem_trong_BST;

import java.util.Scanner;

public class TestBSTsearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BSTsearch bst =new BSTsearch();
        bst.root=new Node(5);
        bst.root.left=new Node(3);
        bst.root.right=new Node(8);
        bst.root.left.left=new Node(2);
        bst.root.left.right=new Node(4);
        bst.root.right=new Node(7);
        System.out.println("Nhập phần tử cần tìm: ");
        int elementFind=Integer.parseInt(scanner.nextLine());
        boolean find= bst.search(elementFind);
        if(find){
            System.out.println("Được tìm thấy");
        }else {
            System.out.println("Không được tìm thấy");
        }
    }
}
