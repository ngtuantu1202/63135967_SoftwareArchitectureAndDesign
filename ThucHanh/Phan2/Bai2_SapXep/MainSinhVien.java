package ThucHanh.Phan2.Bai2_SapXep;

public class MainSinhVien {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();

        SinhVien sv1 = new SinhVien("Tuan Tu 1", 12, 8.5f);
        SinhVien sv2 = new SinhVien("Tuan Tu 3", 10, 9.0f);
        SinhVien sv3 = new SinhVien("Tuan Tu 2", 20, 7.0f);

        qlsv.themSinhVien(sv1);
        qlsv.themSinhVien(sv2);
        qlsv.themSinhVien(sv3);

        System.out.println("DSSV khi sap xep theo ten: ");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("\nDSSV khi sap xep theo diem: ");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
