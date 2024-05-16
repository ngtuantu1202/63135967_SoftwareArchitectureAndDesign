package behavioral.Chain_of_Responsibility.VeSo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainVeSo {
    public static void main(String[] args) {
        List<String> giaiThuongs = new ArrayList<>(Arrays.asList("861225", "12345", "67890")) ;
        String veSo = "1234567";
        String giaiThuong = "123456";
        String sub = veSo.substring(veSo.length()-giaiThuong.length());
        int count = 0;
        for(int i =0; i< sub.length();i++)
        {
            if (sub.charAt(i) == giaiThuong.charAt(i))
                count ++;
        }
        if (count == giaiThuong.length()-1)
        {
            System.out.println("Giải Khuyến khích");
        }
    }
}