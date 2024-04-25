package behavioral.Chain_of_Responsibility.TienDien;

public class MainTienDien {
    public static void main(String[] args) {
        TienDienBacThang bacCaoNhat = new BacCaoNhat();
        bacCaoNhat.min = 0;
        bacCaoNhat.max = Integer.MAX_VALUE;
        bacCaoNhat.gia = 3151;

        TienDienBacThang bacThongThuong = new BacThongThuong();
        bacThongThuong.min = 401;
        bacThongThuong.max = Integer.MAX_VALUE;
        bacThongThuong.gia = 3050;

        bacThongThuong.keTiep(bacCaoNhat);

        int soKW = 1;
        int tienDien = bacThongThuong.tinhTienDien(soKW);
        System.out.println("Tổng tiền điện là: " + tienDien + " VNĐ");
    }
}
