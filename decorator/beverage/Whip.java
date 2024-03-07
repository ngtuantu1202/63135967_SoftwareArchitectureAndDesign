package decorator.beverage;

public class Whip extends CondimentDecorator{
    public Whip(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float cost() {
        return 7 + beverage.cost();
    }
}
