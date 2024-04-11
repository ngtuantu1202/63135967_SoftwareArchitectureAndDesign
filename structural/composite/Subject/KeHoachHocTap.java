package structural.composite.Subject;

public abstract class KeHoachHocTap {
    String ten;

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract void add(KeHoachHocTap k);

    public abstract void remove(KeHoachHocTap k);

    public abstract String getThongTin();
    public abstract int getSoTC();
    public abstract double getHP();
}
