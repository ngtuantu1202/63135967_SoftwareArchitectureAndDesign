package behavioral.observer.StreamData;

import java.util.Date;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {

        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        Client client = new Client(stream);

        System.out.println("Lần 1: ");
        dataAccess.them(new MonHoc("01", "Thể dục", 3));

        System.out.println("Lần 2: ");
        dataAccess.them(new MonHoc("02", "Toán", 4));
    }
}
