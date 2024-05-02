package behavioral.Iterator.Interger;

public class MainArray {
    public static void main(String[] args) {
        ArrayCollection63 array = new ArrayCollection63();
        Iterator63 iterator = array.createIterator();
        while (!iterator.isDone())
        {
            System.out.println(iterator.next());
        }
    }
}
