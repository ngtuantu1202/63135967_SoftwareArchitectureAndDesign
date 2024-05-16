package behavioral.Chain_of_Responsibility.VeSo;

import java.util.List;

public class GiaiKK extends GiaiThuong {
    GiaiThuong keTiep;
    public GiaiKK(String tenGiai, List<String> soTrungThuongs) {
        super(tenGiai, soTrungThuongs);
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        this.keTiep = keTiep;
        return this.keTiep;
    }

    @Override
    public void doVeSo(String veSo) {
        for(String giaiThuong : soTrungThuongs)
        {
            String sub = veSo.substring(veSo.length()-giaiThuong.length());
            int count = 0;
            for(int i =0; i< sub.length();i++)
            {
                if (sub.charAt(i) == giaiThuong.charAt(i)) {
                    count ++;
                }
            }
            if (count == giaiThuong.length()-1)
            {
                System.out.println("Giai khuyen khich");
            }
        }
        if (keTiep != null) {
            keTiep.doVeSo(veSo);
        } else {
            System.out.println("Không trúng giải");
        }
    }
}