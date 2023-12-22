package bai_4_cai_dat_thao_tac_tim_kiem_trong_BST;

public class BSTsearch {
    Node root ;
    public BSTsearch(){}
    public boolean search (int element){
        Node current=root ;
        while (current!=null && element!=current.data){
            if (element<current.data){
                current=current.left;
            }else {
                current=current.right;
            }
        }
        if (current==null){
            return false ;
        }else {
            return true;
        }
    }
}
