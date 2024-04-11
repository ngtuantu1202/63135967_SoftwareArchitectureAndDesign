package structural.composite.Subject;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap {
    private List<KeHoachHocTap> khhts = new ArrayList<>();

    public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    public void add(KeHoachHocTap k) {
        khhts.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {
        khhts.remove(k);
    }

    @Override
    public String getThongTin() {
        StringBuilder builder = new StringBuilder();
        for (KeHoachHocTap k : khhts) {
            builder.append(k.getThongTin()).append("\n");
        }
        return builder.toString();
    }

    @Override
    public int getSoTC() {
        int tongTC = 0;
        for (KeHoachHocTap k : khhts) {
            tongTC += k.getSoTC();
        }
        return tongTC;
    }

    @Override
    public double getHP() {
        int tongHP = 0;
        for(KeHoachHocTap k : khhts) {
            tongHP += k.getHP();
        }
        return tongHP;
    }
}

