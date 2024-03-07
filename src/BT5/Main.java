package BT5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        Scanner scanner = new Scanner(System.in);
        int indexStudent = 0;
        do {
            System.out.println("====================MENU====================");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn 1 - 5: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    for(int i = 0; i < indexStudent; i++) {
                        students[i].displayStudent();
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới học sinh");
                    int num = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < num; i++) {
                        students[indexStudent] = new Student();
                        students[indexStudent].inputStudent(scanner);
                        indexStudent++;
                    }
                case 3:
                    System.out.println("Nhập mã học sinh cần sửa thông tin: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < indexStudent; i++) {
                        if(students[i].getId() == id) {
                            students[i].inputStudent(scanner);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Xóa học sinh: ");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < indexStudent; i++) {
                        if(students[i].getId() == idDelete) {
                            for(int j = i; j < indexStudent - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            indexStudent--;
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Cook!");
            }
        } while(true);
    }
}
