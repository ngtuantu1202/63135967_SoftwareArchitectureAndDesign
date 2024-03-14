package creational.builder.bill;
import java.util.Date;

public class HoaDonHeader {
    int maHD;
    Date ngayBan;
    String tenKH;
    public HoaDonHeader(int maHD, Date ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã hoá đơn: ").append(maHD)
                .append("Ngày bán: ").append(ngayBan)
                .append("Tên khách hàng: ").append(tenKH);
        return builder.toString();
    }

    public int getMaHD() {
        return maHD;
    }
    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }
    public Date getNgayBan() {
        return ngayBan;
    }
    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}
