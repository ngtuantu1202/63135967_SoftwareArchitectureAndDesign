package creational.singleton.data;

import java.util.Dictionary;
import java.util.Hashtable;

public class DataAcessUpgrade {
    private static Dictionary<String, DataAcessUpgrade> instance = new Hashtable<>();

    private DataAcessUpgrade() {
    }

    public static DataAcessUpgrade getInstance(String tag) {
        if(instance.get(tag) == null)
        {
            instance.put(tag, new DataAcessUpgrade());
        }
        return instance.get(tag);
    }
    public void them(SanPham s){
        System.out.println("Thêm sản phẩm: " + s);
    }
    public void xoa(SanPham s){
        System.out.println("Xóa sản phẩm: " + s);
    }
}
