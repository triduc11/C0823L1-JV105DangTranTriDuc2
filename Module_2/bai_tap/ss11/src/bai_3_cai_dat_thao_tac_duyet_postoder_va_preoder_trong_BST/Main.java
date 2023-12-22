package bai_3_cai_dat_thao_tac_duyet_postoder_va_preoder_trong_BST;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.right = new Node(35);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);

        // Duyệt cây theo thứ tự post-order
        System.out.println("Post-order traversal: ");
        tree.postOrderTraversal(tree.root);
        // Duyệt cây theo thứ tự pre-order
        System.out.println("\nPre-oder traversal: " );
        tree.preorderTraversal(tree.root);
    }
}