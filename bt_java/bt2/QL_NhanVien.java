package bt_java.bt2;

import bt_java.bt1.NhanVien63;

import java.util.ArrayList;
import java.util.List;

public class QL_NhanVien implements IQLNV{
    List<NhanVien63> list = new ArrayList<>();

    @Override
    public void them(NhanVien63 nv) {
        list.add(nv);
    }
    @Override
    public void inDS(NhanVien63 nv) {
        for (var sv:list)
            System.out.println(nv.toString());
    }

    @Override
    public void inDS() {

    }
}
