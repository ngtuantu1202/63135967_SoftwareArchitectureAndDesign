package ThucHanh.Phan1.Bai4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;

    public ChuyenXeNgoaiThanh(String msChuyen, String hoTen, String soXe, double doanhThu, String noiDen, int soNgayDi) {
        super(msChuyen, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return super.toString() + "Nơi đến " + noiDen + "\n" +
                            "Số Ngày Đi " + soNgayDi + "\n" ;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
}
