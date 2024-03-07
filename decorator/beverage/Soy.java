package decorator.beverage;

public class Soy extends CondimentDecorator{
    public Soy(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float cost() {
        return 5 + beverage.cost();
    }
}
