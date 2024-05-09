package behavioral.observer.Console;
public class Activity implements MyButtonListener {
    int count = 0;

    public Activity(int count) {
        this.count = count;
    }

    @Override
    public void onClick() {
        count++;
        System.out.println("Click lần thứ: " + count);
    }
}
