package creational.singleton.data;

public class UI {
    public void them(SanPham s, String tag) {
        DataAcessUpgrade.getInstance(tag).them(s);
    }

    public void xoa(SanPham s, String tag) {
        DataAcessUpgrade.getInstance(tag).xoa(s);
    }

    public void capNhat(SanPham s, String tag) {
        // Cập nhật sản phẩm
    }
}
