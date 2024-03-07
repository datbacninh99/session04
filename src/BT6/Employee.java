package BT6;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, String gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public double calSalary() {
        return rate * 1300000;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập mã nhân viên: ");
        this.employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        this.gen = scanner.nextLine();
        System.out.println("Nhập hệ số lương: ");
        this.rate = Double.parseDouble(scanner.nextLine());
        this.salary = calSalary();
    }

    public void displayData() {
        System.out.println("======THÔNG TIN NHÂN VIÊN======");
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gen);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
    }
}