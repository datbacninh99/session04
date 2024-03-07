// QuadraticEquation.java
package BT2;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }
    public double getRoot1() {
        double r1 = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
        return r1;
    }
    public double getRoot2() {
        double r2 = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
        return r2;
    }
    public void displayData() {
        System.out.println("Nhập a: " + a);
        System.out.println("Nhập b: " + b);
        System.out.println("Nhập c: " + c);
        double delta = getDiscriminant();
        if (delta >= 0) {
            System.out.println("Phương trình có 2 nghiệm: " + getRoot1() + " và " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: " + getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}