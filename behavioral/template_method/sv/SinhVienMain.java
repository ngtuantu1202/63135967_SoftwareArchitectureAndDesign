package behavioral.template_method.sv;

import java.util.ArrayList;
import java.util.List;

public class SinhVienMain {
    public static void main(String[] args) {
        List<SinhVien> sinhViens = new ArrayList<>();

        sinhViens.add(new SinhVien(1, "Nguyễn Tuấn Tú", "12/02/2003", "Quảng Trị"));
        sinhViens.add(new SinhVien(2, "Nguyễn Chí Hiếu", "29/02/2003","Khánh Hoà"));
        sinhViens.add(new SinhVien(3, "Lê Thị Mỹ Anh", "03/06/2003", "Đà Nẳng"));
        sinhViens.add(new SinhVien(4, "Nguyễn Thị Nở", "04/04/2003", "Hà Nội"));

        System.out.println("Thông tin sinh viên:");
        for (SinhVien sv : sinhViens) {
            System.out.println(sv);
        }
    }
}
