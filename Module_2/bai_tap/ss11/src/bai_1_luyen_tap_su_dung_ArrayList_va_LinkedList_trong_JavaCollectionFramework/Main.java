package bai_1_luyen_tap_su_dung_ArrayList_va_LinkedList_trong_JavaCollectionFramework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManager productManager=new ProductManager() ;
        productManager.addProduct(new Product(1,"Iphone",3000));
        productManager.addProduct(new Product(2,"SamSung",2500));
        productManager.addProduct(new Product(3,"Nokia",2000));
        productManager.addProduct(new Product(4,"Huawei",2700));

        boolean flag=true ;
        do {
            System.out.println("Chọn chức năng\n" +
                    "1.Danh Sách\n" +
                    "2.Hiển thị theo thứ tự tên\n"+
                    "3.Hiển thị theo thứ tự giá\n"+
                    "4.Thêm Mới\n" +
                    "5.Xóa\n" +
                    "6.Chỉnh Sửa\n" +
                    "7.Hiển thị theo ID\n"+
                    "8.Thoát");
            int choose=Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Hiển thị danh sách");
                    productManager.displayProduct();
                    break ;
                case 2:
                    System.out.println("Hiển thị danh sách theo thứ tự tên");
                    productManager.sortProductByName();
                    productManager.displayProduct();
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách theo thứ tự giá");
                    productManager.sortProductByPrice();
                    productManager.displayProduct();
                    break;
                case 4:
                    System.out.println("Thêm mới");
                    System.out.println("-Nhập ID mới");
                    int newID=Integer.parseInt(scanner.nextLine());
                    System.out.println("-Nhập tên mới");
                    String newName=scanner.nextLine();
                    System.out.println("-Nhập giá mới");
                    int newPrice=Integer.parseInt(scanner.nextLine());
                    productManager.addProduct(new Product(newID,newName,newPrice));
                    System.out.println("-Danh sách sau khi thêm mới");
                    productManager.displayProduct();
                    break;
                case 5:
                    System.out.println("Xóa");
                    System.out.println("-Nhập ID xóa");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    productManager.removeProduct(deleteID);
                    System.out.println("-Danh sách sau khi xóa");
                    productManager.displayProduct();
                    break;
                case 6:
                    System.out.println("Chính sửa");
                    System.out.println("-Nhập ID chỉnh sửa");
                    int updateId=Integer.parseInt(scanner.nextLine());
                    System.out.println("-Nhập tên chỉnh sửa");
                    String updateName= scanner.nextLine();
                    System.out.println("-Nhập giá chỉnh sửa");
                    int updatePrice=Integer.parseInt(scanner.nextLine());
                    productManager.updateProduct(updateId,updatePrice,updateName);
                    System.out.println("-Danh sách sau khi chỉnh sửa");
                    productManager.displayProduct();
                    break;
                case 7:
                    System.out.println("Hiển thị theo ID");
                    System.out.println("-Nhập ID hiển thị");
                    int findById =Integer.parseInt(scanner.nextLine());
                    Product foundProduct=productManager.findByIdProduct(findById);
                    if(foundProduct!=null){
                        System.out.println("Tìm thấy sán phẩm: "+foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm");
                    }
                    break;
                case 8:
                    System.out.println("Đã thoát");
                    flag=false;
                    break;
            }
        }while(flag);
    }
}
