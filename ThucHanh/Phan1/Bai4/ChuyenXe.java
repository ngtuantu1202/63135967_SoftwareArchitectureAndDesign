package ThucHanh.Phan1.Bai4;
public class ChuyenXe {
    String msChuyen, hoTen, soXe;
    double doanhThu;

    @Override
    public String toString() {
        return "Mã số chuyến " + msChuyen + "\n" +
               "Tài xế " + hoTen + "\n" +
               "Số xe " + soXe + "\n" +
               "Doanh thu " + doanhThu + "\n" ;
    }

    //Constructor
    public ChuyenXe(String msChuyen, String hoTen, String soXe, double doanhThu) {
        this.msChuyen = msChuyen;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }


    //Getter
    public String getMsChuyen() {
        return msChuyen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public String getSoXe() {
        return soXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }

    //Setter
    public void setMsChuyen(String msChuyen) {
        this.msChuyen = msChuyen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
