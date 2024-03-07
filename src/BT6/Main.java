package BT6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            employees[i] = new Employee();
            employees[i].inputData(scanner);
        }
        for(Employee employee : employees) {
            employee.displayData();
        }
    }
}