package behavioral.Chain_of_Responsibility.f88;

public class NhanVien extends NhanVienF88{

    public NhanVien(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    NhanVienF88 capTren;

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        capTren = nv;
        return capTren;
    }

    @Override
    public String xuLyKhoangVay(int tienVay) {
        if (tienVay <= hanMucXuLyVay) {
            StringBuilder builder= new StringBuilder();
            builder.append(chucVu).append(": ")
                    .append(ten)
                    .append("\nXử lý khoảng vay: ").append(tienVay)
                    .append("\n");
            return builder.toString();
        } else {
            return capTren.xuLyKhoangVay(tienVay);
        }
    }
}
