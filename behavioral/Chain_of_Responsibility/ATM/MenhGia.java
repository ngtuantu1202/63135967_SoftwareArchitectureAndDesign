package behavioral.Chain_of_Responsibility.ATM;

public class MenhGia extends ATM_TheoMenhGia{
    ATM_TheoMenhGia menhGiaKeTiep;
    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        this.menhGiaKeTiep = m;
        return m;
    }

    @Override
    public void rutTien(int soTien) {
        int soTienTo = soTien / menhGia;
        if (soTienTo > 0) {
            System.out.println("Có " + soTienTo + " tờ tiền mệnh giá " + menhGia);
        }
        int soDu = soTien % menhGia;
        if (soDu > 0 && menhGiaKeTiep != null) {
            menhGiaKeTiep.rutTien(soDu);
        }
    }
}
