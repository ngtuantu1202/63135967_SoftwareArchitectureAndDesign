package behavioral.Chain_of_Responsibility.VeSo;

import java.util.List;

public class GiaiThongThuong extends GiaiThuong{
    GiaiThuong keTiep;

    public GiaiThongThuong(String tenGiai, List<String> soTrungThuongs, GiaiThuong keTiep) {
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
        for(String s : soTrungThuongs) {
            if(veSo.endsWith(s)) {
                System.out.println("Bạn trúng giải: " + tenGiai);
                return;
            }
        }
        if(keTiep != null) {
            keTiep.doVeSo(veSo);
        }
    }
}
