package decorator.bieuthuc;

public class Cong extends BieuThucDecorator {
    public float toanHang;

    public Cong(String bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() + toanHang;
    }
    @Override
    public String getBieuThuc() {
        return super.getBieuThuc();
    }
}
