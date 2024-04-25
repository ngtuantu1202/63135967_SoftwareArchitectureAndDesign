package behavioral.Chain_of_Responsibility.ATM;

public abstract class ATM_TheoMenhGia {
    int menhGia;
    ATM_TheoMenhGia menhGiaKeTiep;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }
    public abstract ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m);
    public abstract void rutTien(int soTien);
//        int soTienTo = soTien / menhGia;
//        if (soTienTo > 0) {
//            System.out.println("In ra " + soTienTo + " tờ tiền " + menhGia);
//        }
//        int soDu = soTien % menhGia;
//        if (menhGiaKeTiep != null && soDu > 0) {
//            menhGiaKeTiep.rutTien(soDu);
//        }
//    }
}
