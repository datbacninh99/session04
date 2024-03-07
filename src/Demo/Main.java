package Demo;

public class Main {
    public static void main(String[] args) {
        // Tạo 2 đối tượng từ lớp SinhVien
        SinhVien sv1 = new SinhVien("20810310001", "Nguyễn Viết Đạt", 22, true);
        SinhVien sv2 = new SinhVien("20810310030", "Trương Phan Quốc Huy", 22, true);

        // Gọi đến phương thức hiển thị thông tin
        sv1.displayData();
        System.out.println("===============================================");
        sv2.displayData();
    }
}