package ThucHanh.Phan1.Bai1;

public class MainNhanVien {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Nguyen Van A", "Ha Thanh",21, 300, 40.000);
        System.out.println("Ten cua nhan vien: " + nhanVien1.getTen());
        System.out.println("Tuoi cua nhan vien: " + nhanVien1.getTuoi());
        System.out.println("Dia chi cua nhan vien: " + nhanVien1.getDiaChi());
        System.out.println("Tien luong cua nhan vien: " + nhanVien1.getTienLuong());
        System.out.println("Tong so gio lam cua nhan vien: " + nhanVien1.getTongGioLam());
    }
}
