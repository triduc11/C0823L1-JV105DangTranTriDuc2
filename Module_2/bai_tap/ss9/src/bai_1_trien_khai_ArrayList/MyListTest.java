package bai_1_trien_khai_ArrayList;



public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger =new MyList<>() ;
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        System.out.println( listInteger.size());
        listInteger.remove(2);
        System.out.println( listInteger.size());
        listInteger.set(2,10) ;
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.contains(8));
        System.out.println(listInteger.indexOf(6));
        listInteger.clear();
        System.out.println(listInteger.indexOf(6));
    }
}
