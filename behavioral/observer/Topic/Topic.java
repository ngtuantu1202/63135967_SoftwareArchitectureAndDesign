package behavioral.observer.Topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TinTuc> list = new ArrayList<>();
    List<TopicListener> listeners = new ArrayList<>();

    public void dangKy(TopicListener listener) {
        listeners.add(listener);
    }

    public void huyDangKy(TopicListener listener) {
        listeners.remove(listener);
    }
    void themMoi(TinTuc t)
    {
        list.add(t);
        for(TopicListener listener:listeners)
            listener.listen(t);
    }
    public void capNhat(TinTuc t)
    {

    }
}
