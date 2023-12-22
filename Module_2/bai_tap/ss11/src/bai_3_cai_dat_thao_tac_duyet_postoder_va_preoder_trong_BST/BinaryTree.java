package bai_3_cai_dat_thao_tac_duyet_postoder_va_preoder_trong_BST;

public class BinaryTree {
    Node root;

    void postOrderTraversal(Node node) {
        if (node == null)
            return;
        // Bước 1: Duyệt cây con bên trái
        postOrderTraversal(node.left);
        // Bước 2: Duyệt cây con bên phải
        postOrderTraversal(node.right);
        // Bước 3: Truy cập nút gốc
        System.out.print(node.data + " ");
    }
    void preorderTraversal(Node node) {
        if (node == null)
            return;
        // Bước 1: Truy cập nút gốc
        System.out.print(node.data + " ");
        // Bước 2: Duyệt cây con bên trái
        postOrderTraversal(node.left);
        // Bước 3: Duyệt cây con bên phải
        postOrderTraversal(node.right);
    }
}