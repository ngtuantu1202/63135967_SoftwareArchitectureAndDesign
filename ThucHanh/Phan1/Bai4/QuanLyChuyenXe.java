package ThucHanh.Phan1.Bai4;
import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> list = new ArrayList<>();
    public int themChuyenXe(ChuyenXe cx){
        for(ChuyenXe c: list)
            if(c.msChuyen.equals(cx.msChuyen))
                return 0;
        list.add(cx);
        return 1;
    }
    public void inDS(){
        for (ChuyenXe c: list)
            System.out.println(c.toString());
    }
    public float doanhThuXeNoiThanh(){
        float doanhThu1 = 0;
        for (ChuyenXe c : list) {
            if (c instanceof ChuyenXeNoiThanh) {
                doanhThu1 += c.getDoanhThu();
            }
        }
        return doanhThu1;
    }
    public float doanhThuXeNgoaiThanh(){
        float doanhThu2 = 0;
        for (ChuyenXe c : list) {
            if (c instanceof ChuyenXeNgoaiThanh) {
                doanhThu2 += c.getDoanhThu();
            }
        }
        return doanhThu2;
    }

    public float tongDoanhThu() {
        float tongDoanhThu = 0;
        for (ChuyenXe c : list) {
            tongDoanhThu += c.getDoanhThu();
        }
        return tongDoanhThu;
    }

}
