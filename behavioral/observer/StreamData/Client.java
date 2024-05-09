package behavioral.observer.StreamData;

import java.util.List;

public class Client implements MyStreamListener<List<MonHoc>> {
    MyStream<List<MonHoc>> stream;

    public Client(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
        this.stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for (MonHoc monHoc : monHocs) {
            System.out.println(monHoc.toString());
        }
    }
}
