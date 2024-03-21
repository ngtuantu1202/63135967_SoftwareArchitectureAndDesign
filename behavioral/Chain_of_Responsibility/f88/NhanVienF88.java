package behavioral.Chain_of_Responsibility.f88;

public abstract class NhanVienF88 {
    String ten, chucVu;
    int hanMucXuLyVay;

    public NhanVienF88(String ten, String chucVu, int hanMucXuLyVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucXuLyVay = hanMucXuLyVay;
    }

    public abstract NhanVienF88 capCaoHon(NhanVienF88 nv);
    public abstract String xuLyKhoangVay(int tienVay);
}
