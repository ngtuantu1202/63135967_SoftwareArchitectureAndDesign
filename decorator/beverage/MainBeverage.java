package decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cà phê NTT");
        Beverage e = new Espresso("Cà phê đen");
        b = new Milk("Star", b);
        b = new Milk("Vinamilk", b);
        b = new Mocha("Mlem", e);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        System.out.println(e.getDescription());
        System.out.println(e.cost());
    }
}
