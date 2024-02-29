package ThucHanh.Phan1.Bai4;

public class ChuyenXeNoiThanh extends ChuyenXe {
    int soTuyen, soKM;

    public ChuyenXeNoiThanh(String msChuyen, String hoTen, String soXe, double doanhThu, int soTuyen, int soKM) {
        super(msChuyen, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return super.toString() + "Số tuyến " + soTuyen + "\n"
                                + "Số KM đi đc " + soKM + "\n";
    }

    //GET SET
    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }
}
