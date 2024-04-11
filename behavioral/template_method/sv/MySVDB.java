package behavioral.template_method.sv;

public class MySVDB extends SinhVienDB<SinhVien>{
    @Override
    public int getId(SinhVien sinhVien) {
        return sinhVien.getMaSV();
    }
}
