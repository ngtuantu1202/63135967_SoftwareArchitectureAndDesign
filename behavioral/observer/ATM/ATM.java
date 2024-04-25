package behavioral.observer.ATM;

public class ATM {
    TaiKhoanATM theATM;

    public void nhanThe(TaiKhoanATM theATM) {
        this.theATM = theATM;
    }

    public void traThe(TaiKhoanATM theATM) {
        this.theATM = null;
    }

    public void rutTien(int soTien) {
        if (theATM != null) {
            if (theATM.kiemTraSoDu(soTien) == true)
                theATM.nhanThongBao(soTien, true);
            else
                theATM.nhanThongBao(soTien, false);
        } else {
            System.out.println("Ko có thẻ trong máy");
        }
    }

    public static interface TaiKhoanATM {
        boolean kiemTraSoDu(int soTien);

        void nhanThongBao(int soTienRut, boolean thanhCong);
    }
}
