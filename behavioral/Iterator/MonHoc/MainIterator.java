package behavioral.Iterator.MonHoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void duyetmonHoc(Iterator<MonHoc> iterator)
    {
        while (iterator.hasNext())
        {
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator iterator = list.iterator();
        System.out.println("Cách 1:");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("Cách 2:");
        Iterator<Integer> iterator2 = list.iterator();
        iterator2.forEachRemaining(integer -> System.out.println(integer));

        List<MonHoc> mhs = new ArrayList<>(Arrays.asList(
                new MonHoc("Thể dục", 1),
                new MonHoc("Toán", 3),
                new MonHoc("XSTK", 3),
                new MonHoc("Java", 2)
        ));
        duyetmonHoc(mhs.iterator());
    }
}
