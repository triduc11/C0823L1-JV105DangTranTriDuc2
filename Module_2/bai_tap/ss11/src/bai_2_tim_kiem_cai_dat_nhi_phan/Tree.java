package bai_2_tim_kiem_cai_dat_nhi_phan;

public interface Tree<E> {
    /**
     * Insert element e into the binary search tree.
     * Return true if the element is inserted successfully.
     */
    boolean insert(E e);

    /**
     * Inorder traversal from the root
     */
    void inorder();

    /**
     * Get the number of nodes in the tree
     */
    int getSize();
}
