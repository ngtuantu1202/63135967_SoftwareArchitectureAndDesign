package ThucHanh.Phan2.Bai1_Tinh;

public class Chia implements Tinh{
    @Override
    public Tinh tinh(float a, float b) {
        if (b == 0) {
            return float.POSITIVE_INFINITY;
        }
        return a/b;
    }
}
