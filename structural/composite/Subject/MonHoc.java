package structural.composite.Subject;

public class MonHoc extends KeHoachHocTap {
    int soTC, hp;

    public MonHoc(String ten, int soTC, int hp) {
        super(ten);
        this.soTC = soTC;
        this.hp = hp;
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }

    @Override
    public String getThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append("Họ và tên: ").append(ten)
                .append("\nSố tín chỉ: ").append(soTC)
                .append("\nHọc phí: ").append(hp);
        return builder.toString();
    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public double getHP() {
        return hp;
    }
}
