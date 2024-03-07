package BT1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Đỏ");

        circle.displayData();

        System.out.println("Chu vi của hình tròn: " + circle.chuVi());
        System.out.println("Diện tích của hình tròn: " + circle.dienTich());
    }
}
