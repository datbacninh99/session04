package BT5;

import java.util.Scanner;
public class Student {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String address;
    private String phone;
    Student() {
    }
    public Student(int id, String name, int age, String sex, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void inputStudent(Scanner scanner) {
        System.out.println("Nhập mã học sinh: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên học sinh: ");
        this.name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        this.sex = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.phone = scanner.nextLine();
    }
    public void displayStudent() {
        System.out.println("======THÔNG TIN HỌC SINH======");
        System.out.println("Mã học sinh: " + id);
        System.out.println("Tên học sinh: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + sex);
        System.out.println("Điạ chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);
    }
}