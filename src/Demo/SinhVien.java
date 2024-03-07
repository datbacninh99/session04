package Demo;

public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private int tuoi;
    private boolean gioiTinh;

    // Constructor không tham số
    private SinhVien() {
    }

    // Constructor đầy đủ tham số
    public SinhVien(String maSinhVien, String tenSinhVien, int tuoi, boolean gioiTinh) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    // Getter và Setter
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setTuoi(int namSinh) {
        this.tuoi = namSinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    // Phương thức displayData() hiển thị thông tin sinh viên
    public void displayData() {
        System.out.println("Mã sinh viên là: " + maSinhVien);
        System.out.println("Tên sinh viên là: " + tenSinhVien);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + (gioiTinh ? "Nam" : "Nữ"));
    }
}