package decorator.tokenize;

public class TachTuMain {
    public static void main(String[] args) {
        String s = "Hôm nay, trời mưa nhưng tôi vẫn phải nghỉ học!";
        MyTokenize t = new TachTu(s);
        System.out.println("Chuỗi gốc:");
        System.out.println(t.tokenize());

        t = new LoaiBoTuDung(t);
        System.out.println("Chuỗi sau khi loại bỏ từ dừng:");
        System.out.println(t.tokenize());

        t = new LoaiBoDauCau(t);
        System.out.println("Chuỗi sau khi loại bỏ dấu câu:");
        System.out.println(t.tokenize());
    }

//    public static void inDS(List<String> list) {
//        for (String s : list)
//            System.out.println(s);
//    }
}
