//package QL_San_Pham;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ManagerProduct {
//
//    ArrayList<Product> list = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//
//    public void manu(){
//        System.out.println("MANU");
//        System.out.println("1. thêm sản phẩm");
//        System.out.println("2. sửa tên theo tên");
//        System.out.println("3. xóa sản phẩm theo tên");
//        System.out.println("4. hiển thị danh sách sản phẩm");
//        System.out.println("5. tìm kiếm sản phẩm");
//        int choice = Integer.parseInt(scanner.nextLine());
//        switch (choice){
//            case 1:
//                createProducts();
//                break;
//            case 2:
//                editName();
//                break;
//            case 3:
//                deleteProducts();
//                break;
//            case 4:
//                displayProducts();
//                break;
//            case 5:
//                searchProducts();
//                break;
//        }
//    }
//
//}
