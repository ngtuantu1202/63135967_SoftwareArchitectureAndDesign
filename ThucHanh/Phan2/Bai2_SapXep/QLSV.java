package ThucHanh.Phan2.Bai2_SapXep;
import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> dssv = new ArrayList<>();
    ISoSanh soSanh;

    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }
    public void themSinhVien(SinhVien sv) {
        dssv.add(sv);
    }
    public void sapXep(){
        for(int i=0; i<dssv.size()-1;i++)
            for(int j=i+1; j<dssv.size();j++)
                if(soSanh.soSanh(dssv.get(i), dssv.get(j))>0)   //1 cai la bien 1 cai la phuong thuc
                {
                    SinhVien s = dssv.get(i);
                    dssv.set(i, dssv.get(j));
                    dssv.set(j, s);

                }
    }
//    public void sapXep(){
//        dssv.sort((o1, o2) -> soSanh.soSanh(o1, o2));
//    }
    public void inDS(){
        for (SinhVien sv : dssv) {
            System.out.println("Ten: " + sv.getHoTen() + ", Diem TB: " + sv.getDiemTB());
        }
    }
}
