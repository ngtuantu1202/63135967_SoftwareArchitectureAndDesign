package behavioral.stratery.duck;

public class VitQuay extends Duck{

    @Override
    public void display() {
        System.out.println("Tớ là vịt quay!");
        performQuack();
        performFly();
        System.out.println("Chúc ngon miệng");
    }
}
