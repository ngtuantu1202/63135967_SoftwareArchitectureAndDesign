package ThucHanh.Phan2.Bai1_Tinh;

public class Context {
    Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan){
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b) {
        return tinhToan.tinh(a, b);
    }
}
