package ThucHanh.Phan2.Bai1_Tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.setTinhToan(new Cong().tinh(5, 3)));
    }
}
