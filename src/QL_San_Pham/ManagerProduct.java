package QL_San_Pham;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {

    ArrayList<Product> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void manu() {
        System.out.println("MANU");
        System.out.println("1. thêm sản phẩm");
        System.out.println("2. sửa tên theo tên");
        System.out.println("3. xóa sản phẩm theo tên");
        System.out.println("4. hiển thị danh sách sản phẩm");
        System.out.println("5. tìm kiếm sản phẩm");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                createProducts();
                break;
            case 2:
                editName();
                break;
            case 3:
                deleteProducts();
                break;
            case 4:
                list.sort(new SortByPrice());
                displayProducts();
                break;
            case 5:
                searchProducts();
                break;
        }
    }
    public Product create(){
        System.out.println("1. nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("2. giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("3. số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        return new Product(name, price, quantity);
    }

    public void createProducts() {
        list.add(create());
    }

    public void editName() {
        System.out.println("Nhập tên muốn sửa:");
        int quantity = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getQuantity()==quantity) {
               list.set(i,create());
            }
        }
    }

    public void deleteProducts() {
        System.out.println("Nhập tên sản phẩm muốn xóa");
        int quantity = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getQuantity() == quantity) {
                list.remove(list.get(i));
            }
        }
    }

    public void displayProducts() {
        for (Product pt : list) {
            System.out.println(pt);
        }
    }

    public void searchProducts() {
        boolean check = false;
        System.out.println("Nhập tên cần tìm: ");
        String timten = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(timten)) {
                System.out.println(list.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("không thấy tên cần tìm");
        }
    }

}
