package behavioral.observer.StreamData;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void them(MonHoc monHoc) {
        list.add(monHoc);
        stream.addEvent(list);
    }
}
