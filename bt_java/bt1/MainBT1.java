package bt_java.bt1;

public class MainBT1 {
    public static void main(String[] args) {
        NhanVien63 nv1 = new NhanVien63("Tuấn Tú", "Nha Trang", 21, 220, 1_500_000);
        NhanVien63 nv2 = new NhanVien63("Chí Hiếu", "Nha Trang", 21, 210, 1_400_000);
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
