package creational.singleton.data;

public class MainData {
    public static void main(String[] args) {
        UI ui1 = new UI();
        UI ui2 = new UI();
        ui1.them(new SanPham(1, 10, "Sản phẩm 1", 100.0), "t1");
        ui2.them(new SanPham(2, 20, "Sản phẩm 2", 200.0), "t1");
        ui2.them(new SanPham(3, 30, "Sản phẩm 3", 300.0), "t2");
    }
}
