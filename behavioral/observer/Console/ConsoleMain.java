package behavioral.observer.Console;

public class ConsoleMain {
    public static void main(String[] args) {
        MyButton btn = new MyButton();
        Activity atv = new Activity(0);

        btn.addListener(atv);

        btn.click();
        btn.click();
        btn.click();
    }
}
