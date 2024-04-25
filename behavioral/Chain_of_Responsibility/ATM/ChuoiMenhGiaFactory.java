package behavioral.Chain_of_Responsibility.ATM;

public abstract class ChuoiMenhGiaFactory {
    protected abstract ATM_TheoMenhGia getChuoiMenhGia(int menhGia);

    public void rutTien(int soTien, int menhGiaCaoNhat) {
        ATM_TheoMenhGia chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        chuoiMenhGia.rutTien(soTien);
    }

}
