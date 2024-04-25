package behavioral.observer.ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan t1 = new TaiKhoan("Tú 1",1000000000, atm);
        TaiKhoan t2 = new TaiKhoan("Tú 2",200000, atm);
        t1.duaTheVaoATM();
        System.out.println("Lần 1: ");
        atm.rutTien(300000);
        System.out.println("Lần 2: ");
        atm.rutTien(800000);
        t1.rutTheKhoiATM();
        System.out.println("Lần 3: ");
        atm.rutTien(150000);
        t2.duaTheVaoATM();
        System.out.println("Lần 4: ");
        atm.rutTien(150000);
        System.out.println("Lần 5: ");
        atm.rutTien(200000);
        t2.rutTheKhoiATM();

    }
}
