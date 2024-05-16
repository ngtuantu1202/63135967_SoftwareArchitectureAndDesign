package behavioral.Chain_of_Responsibility.VeSo;

import java.util.List;

public class GiaiUt extends GiaiThuong {
    GiaiThuong keTiep;

    public GiaiUt(String tenGiai, List<String> soTrungThuongs, GiaiThuong keTiep) {
        super(tenGiai, soTrungThuongs);
        this.keTiep = keTiep;
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        this.keTiep = keTiep;
        return this.keTiep;
    }

    @Override
    public void doVeSo(String veSo) {
        for (String s : soTrungThuongs) {
            if (veSo.endsWith(s)) {
                System.out.println("Chúc mừng! Bạn đã trúng " + tenGiai);
                return;
            }
        }
        System.out.println("Chúc may mắn lần sau");
    }
}