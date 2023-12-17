package bai_2_trien_khai_LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(7);
        myLinkedList.printList();
    }
}
