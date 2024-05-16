package behavioral.Chain_of_Responsibility.VeSo;

import java.util.ArrayList;
import java.util.List;

public abstract class GiaiThuong {
    String tenGiai;
    List<String> soTrungThuongs = new ArrayList<>();

    public GiaiThuong(String tenGiai, List<String> soTrungThuongs) {
        this.tenGiai = tenGiai;
        this.soTrungThuongs = soTrungThuongs;
    }

    public abstract GiaiThuong giaiKeTiep(GiaiThuong keTiep);
    public abstract void doVeSo(String veSo);
}
