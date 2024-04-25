package behavioral.Chain_of_Responsibility.ATM;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        return m;
    }

    @Override
    public void rutTien(int soTien) {
        int soTienTo = soTien / menhGia;
        System.out.println("Có " + soTienTo + " tờ tiền mệnh giá " + menhGia);
    }
}
