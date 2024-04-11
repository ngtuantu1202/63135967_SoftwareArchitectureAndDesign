package structural.composite.Subject;

public class MainSubject {
    public static void main(String[] args) {
        MonHoc mh1 = new MonHoc("Lập trình Java", 3, 800000);
        MonHoc mh2 = new MonHoc("Cấu trúc dữ liệu và GT", 4, 400000);
        MonHoc mh3 = new MonHoc("Trí tuệ nhân tạo", 2, 1000000);

        KeHoachChung keHoach = new KeHoachChung("Khóa học Java");

        keHoach.add(mh1);
        keHoach.add(mh2);
        keHoach.add(mh3);

        System.out.println("Thông tin khóa học:");
        System.out.println(keHoach.getThongTin());

        System.out.println("Tổng số tín chỉ: " + keHoach.getSoTC());
        System.out.println("Tổng học phí: " + keHoach.getHP());
    }

}
