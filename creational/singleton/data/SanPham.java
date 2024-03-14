package creational.singleton.data;

public class SanPham {
    private int maSP, soLuong;
    private String tenSP;
    private double donGia;

    public SanPham() {
    }

    public SanPham(int maSP, int soLuong, String tenSP, double donGia) {
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP=" + maSP +
                ", soLuong=" + soLuong +
                ", tenSP='" + tenSP + '\'' +
                ", donGia=" + donGia +
                '}';
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
