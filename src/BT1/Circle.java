package BT1;

public class Circle {
    private double bankinh;
    private String color;

    private Circle() {
    }
    public Circle(double bankinh, String color) {
        this.bankinh = bankinh;
        this.color = color;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double chuVi() {
        return 2 * Math.PI * this.bankinh;
    }

    public double dienTich(){
        return Math.PI * Math.pow(this.bankinh, 2);
    }
    public void displayData() {
        System.out.println("Bán kính hình tròn là: " + bankinh);
        System.out.println("Màu sắc của hình tròn là: " + color);
    }
}