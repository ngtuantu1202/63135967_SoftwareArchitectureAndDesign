package creational.singleton.data;

import java.util.ArrayList;
import java.util.List;

// Cai dat Singleton
public class DataAccess {
    private static DataAccess instance;
    private List<SanPham> dsSanPham;

    private DataAccess() {
        dsSanPham = new ArrayList<>();
    }

    public static synchronized DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }

    public void themSanPham(SanPham sanPham) {
        dsSanPham.add(sanPham);
    }

    public void xoaSanPham(SanPham sanPham) {
        dsSanPham.remove(sanPham);
    }

    public void display() {
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sp : dsSanPham) {
            System.out.println(sp);
        }
    }
}
