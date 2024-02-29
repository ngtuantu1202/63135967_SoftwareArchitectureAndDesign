package ThucHanh.Phan2.Bai2_SapXep;


public class SinhVien {
     String hoTen;
     int ngaySinh;
     float diemTB;

    public SinhVien(String hoTen, int ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public float getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
}