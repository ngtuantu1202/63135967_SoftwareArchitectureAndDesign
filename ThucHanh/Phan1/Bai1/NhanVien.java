package ThucHanh.Phan1.Bai1;

public class NhanVien {
    String ten, diaChi;
    int tuoi, tongGioLam;
    double tienLuong;

    //Constructor ko tham so
    public NhanVien() {
        this.ten = "";
        this.diaChi = "";
        this.tuoi = 0;
        this.tongGioLam = 0;
        this.tienLuong = 0.0;
    }
    //Constructor day du tham so
    public NhanVien(String ten, String diaChi, int tuoi, int tongGioLam, double tienLuong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tongGioLam = tongGioLam;
        this.tienLuong = tienLuong;
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

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
}
