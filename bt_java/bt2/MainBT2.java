package bt_java.bt2;

import bt_java.bt1.NhanVien63;

public class MainBT2 {
    public static void main(String[] args) {
        IQLNV qlnv = new QL_NhanVien();
        qlnv.them(new NhanVien63("Tuấn Tú", "Nha Trang", 21, 220, 1_500_000));
        qlnv.them(new NhanVien63("Chí Hiếu", "Nha Trang", 21, 210, 1_400_000));
        qlnv.inDS();
    }
}
