package behavioral.Chain_of_Responsibility.ATM;

public abstract class ATM_TheoMenhGia {
    int menhGia;
    ATM_TheoMenhGia menhGiaKeTiep;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }
    public abstract ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m);
    public abstract void rutTien(int soTien);
}
