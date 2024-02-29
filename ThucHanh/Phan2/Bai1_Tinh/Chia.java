package ThucHanh.Phan2.Bai1_Tinh;

public class Chia implements Tinh{
    @Override
    public float tinh(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
