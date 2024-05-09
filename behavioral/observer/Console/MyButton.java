package behavioral.observer.Console;
import java.util.ArrayList;
import java.util.List;

public class MyButton {
    List<MyButtonListener> listeners = new ArrayList<>();

    void addListener(MyButtonListener listener)
    {
        listeners.add(listener);
    }
    void click()
    {
        for (MyButtonListener listener : listeners) {
            listener.onClick();
        }
    }
}
