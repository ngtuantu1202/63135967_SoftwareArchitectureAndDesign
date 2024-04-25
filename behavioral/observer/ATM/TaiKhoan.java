package behavioral.observer.ATM;

public class TaiKhoan implements ATM.TaiKhoanATM {
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM() {
        atm.nhanThe(this);
    }

    public void rutTheKhoiATM() {
        atm.traThe(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50000;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong) {
            System.out.println("Tài khoản: " +ten);
            System.out.println("Số dư: " +soDu);
            System.out.println("Số tiền rút: "+soTienRut);
            soDu -= soTienRut;
            System.out.println("Số dư cuối: " +soDu);
        }
        else {
            System.out.println("Tài khoản: " +ten);
            System.out.println("Số dư: " +soDu);;
        }
    }
}
