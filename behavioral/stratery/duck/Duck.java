package behavioral.stratery.duck;

public abstract class Duck {
    IFlyable flyable;
    IQuackable quackable;
    public abstract void display();
    void performQuack() {
        System.out.println(quackable.quack());
    }
    void swim() {
        System.out.println("Tớ biết bơi ếch, ko biết lặn");
    }
    void performFly() {
        System.out.println(flyable.fly());
    }
    public void setFlyable(IFlyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(IQuackable quackable) {
        this.quackable = quackable;
    }
}
