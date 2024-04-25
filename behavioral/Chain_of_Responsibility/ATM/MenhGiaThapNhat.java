package behavioral.Chain_of_Responsibility.ATM;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }
//    public MenhGiaThapNhat() {
//        super(1);
//    }
    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTienTo = soTien / menhGia;
        System.out.println("Có " + soTienTo + " tờ tiền mệnh giá " + menhGia);
    }
}
