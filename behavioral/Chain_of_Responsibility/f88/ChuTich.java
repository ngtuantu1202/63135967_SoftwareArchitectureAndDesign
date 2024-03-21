package behavioral.Chain_of_Responsibility.f88;

public class ChuTich extends NhanVienF88{

    public ChuTich(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        return this;
    }
    @Override
    public String xuLyKhoangVay(int tienVay) {
        if (tienVay <= hanMucXuLyVay) {
            return "Chức vụ Chủ tịch";
        } else {
            return "Không cho vay";
        }
    }
}

