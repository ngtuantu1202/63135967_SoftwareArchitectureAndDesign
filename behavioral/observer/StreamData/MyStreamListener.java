package behavioral.observer.StreamData;

public interface MyStreamListener<T> {
    void listen(T t);
}
