package creational.builder.bill;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainHoaDon {
    public static void main(String[] args) {

        HoaDonHeader hoaDonHeader = new HoaDonHeader(1, new Date(), "Nguyễn Tuân Tú");

        List<CTHD> cthds = new ArrayList<>();
        cthds.add(new CTHD("Bút bi", 2, 10.5, 0.5));
        cthds.add(new CTHD("Bút chì", 1, 20.0, 0.0));

        HoaDon hoaDon = new HoaDon.Builder()
                .setHoaDonHeader(hoaDonHeader)
                .setCthds(cthds)
                .build();

        System.out.println(hoaDon);
    }
}
