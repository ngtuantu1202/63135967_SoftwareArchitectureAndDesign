package bt_java.bt1;

public class NhanVien63 {
    String ten, diaChi;
    int tuoi, tongSoGioLam;
    double tienLuong;
    public NhanVien63() {};

    public NhanVien63(String ten, String diaChi, int tuoi, int tongSoGioLam, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tongSoGioLam = tongSoGioLam;
        this.tienLuong = tienLuong;
    }
    public double tinhThuong() {
        if(tongSoGioLam >= 200) return tienLuong * 0.2;
        if(tongSoGioLam >= 100) return tienLuong * 0.1;
        return 0;
    }

    @Override
    public String toString() {
        return "Tên: " + ten + "\n" +
               "Tuổi: " + tuoi + "\n" +
               "Địa chỉ: " + diaChi + "\n" +
               "Tổng sô giờ làm: " + tongSoGioLam + "\n" +
               "Tiền lương: " + tienLuong + "\n" +
               "Tiền thưởng: " + tinhThuong() + "\n";
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getTongSoGioLam() {
        return tongSoGioLam;
    }
    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    public double getTienLuong() {
        return tienLuong;
    }
    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
}
