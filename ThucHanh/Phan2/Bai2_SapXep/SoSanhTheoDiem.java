package ThucHanh.Phan2.Bai2_SapXep;

public class SoSanhTheoDiem implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return Float.compare(o1.getDiemTB(), o2.getDiemTB());
    }
}
