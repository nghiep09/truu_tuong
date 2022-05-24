package QL_Khach_Tro;

import javafx.scene.paint.PhongMaterial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HotelList {
    ArrayList<Hotell> hotells = new ArrayList<>();
    ArrayList<Nguoi> nguois = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void manu() {
        System.out.println("MANU");
        System.out.println("1. Tạo phòng mới ");
        System.out.println("2. Tạo khách hàng mới ");
        System.out.println("3. Hiển thị các phòng");
        System.out.println("4. Hiển thị khách hàng");
        System.out.println("5. Tìm kiếm khách hàng");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                createRoom();
                break;
            case 2:
                createCustomers();
                break;
            case 3:
                hotells.sort(new Sortbyprice());
                show();
                break;
            case 4:
                sapxep();
                show1();
                break;
            case 5:
                searchName();
                break;

        }
    }

    public void createRoom() {
        System.out.println("1. nhập loại phòng: ");
        String kindofRoom = scanner.nextLine();
        System.out.println("2. nhập giá phòng: ");
        double roomRates = Double.parseDouble(scanner.nextLine());
        System.out.println("3. nhập số phòng: ");
        int soPhong = Integer.parseInt(scanner.nextLine());
        hotells.add(new Hotell(kindofRoom, roomRates, soPhong));
    }

    public void createCustomers() {
        System.out.println("1. nhập họ tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("2. nhập ngày tháng năm sinh khách hàng: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("3. nhập số CCCD của khách hàng: ");
        int CCCD = Integer.parseInt(scanner.nextLine());
        hotells.add(new Hotell(name, age, CCCD));
    }

    public void searchName() {
        boolean check = false;
        System.out.println("nhập tên cần tìm: ");
        String tencantim = scanner.nextLine();
        for (int i = 0; i < nguois.size(); i++) {
            if (nguois.equals(tencantim)) {
                System.out.println(nguois);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("không thấy tên cần tìm");
        }
    }

    public void show() {
        for (Hotell ht : hotells) {
            System.out.println(ht.toString());
        }
    }
    public void sapxep(){
        System.out.println("hiển thị: ");
        System.out.println("1. hiển thị theo tên: ");
        System.out.println("2. hiển thị theo tuổi");
        int choice1=Integer.parseInt(scanner.nextLine());
        switch (choice1){
            case 1:
                nguois.sort(new SortbyName());
                break;
            case 2:
                nguois.sort(new SortbyAge());
                break;
        }
    }
    public void show1(){
        for (Nguoi ng : nguois) {
            System.out.println(ng.toString());
        }
    }

}
