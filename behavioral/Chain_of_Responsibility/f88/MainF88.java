package behavioral.Chain_of_Responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 bv = new NhanVien("Nguyễn Tuấn Tú 1", "Bảo vệ", 1_000_000);
        NhanVienF88 tapVu = new NhanVien("Nguyễn Tuấn Tú 2","Tạp vụ", 5_000_000);
        NhanVienF88 thuKy = new NhanVien("Nguyễn Tuấn Tú 3", "Thư ký", 20_000_000);
        NhanVienF88 truongPhong = new NhanVien("Nguyễn Tuấn Tú 4", "Trưởng phòng", 50_000_000);
        NhanVienF88 giamDoc = new NhanVien("Nguyễn Tuấn Tú 5", "Giám đốc", 70_000_000);
        NhanVienF88 chuTich = new NhanVien("Nguyễn Tuấn Tú", "Chủ tịch", 100_000_000);

        bv.capCaoHon(tapVu).capCaoHon(thuKy).capCaoHon(truongPhong).capCaoHon(giamDoc).capCaoHon(chuTich);
        System.out.println(bv.xuLyKhoangVay(25_000_000));
        System.out.println(bv.xuLyKhoangVay(1_000_000));
        System.out.println(bv.xuLyKhoangVay(4_000_000));
        System.out.println(bv.xuLyKhoangVay(10_000_000));
        System.out.println(bv.xuLyKhoangVay(50_000_000));
    }
}
