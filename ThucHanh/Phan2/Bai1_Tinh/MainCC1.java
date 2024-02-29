package ThucHanh.Phan2.Bai1_Tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context context = new Context();
        context.setTinhToan(new Cong());
        System.out.println(context.tinh(5, 3));
    }
}
