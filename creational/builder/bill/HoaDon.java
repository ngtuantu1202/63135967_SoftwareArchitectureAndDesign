package creational.builder.bill;

import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<CTHD> cthds;
    protected HoaDon(Builder b) {
        this.hoaDonHeader = b.hoaDonHeader;
        this.cthds = b.cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(hoaDonHeader.toString());
        for(var c: cthds)
            builder.append("\n\t").append(c.toString());
        return builder.toString();
    }
    public static class Builder {
        private HoaDonHeader hoaDonHeader;
        private List<CTHD> cthds;

        public Builder() {
        }

        public Builder setHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder setCthds(List<CTHD> cthds) {
            this.cthds = cthds;
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
