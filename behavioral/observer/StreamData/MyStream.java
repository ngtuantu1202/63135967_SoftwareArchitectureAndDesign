package behavioral.observer.StreamData;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    private List<MyStreamListener<T>> listeners = new ArrayList<>();

    public void addListener(MyStreamListener<T> listener) {
        listeners.add(listener);
    }

    void addEvent(T t) {
        for (MyStreamListener<T> listener : listeners) {
            listener.listen(t);
        }
    }
}

