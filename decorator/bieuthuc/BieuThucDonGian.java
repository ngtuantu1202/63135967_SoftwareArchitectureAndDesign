package decorator.bieuthuc;

public class BieuThucDonGian extends BieuThuc{
    public float toanHang;

    public BieuThucDonGian(String bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return toanHang;
    }
    @Override
    public String getBieuThuc() {
        return super.getBieuThuc();
    }
}
