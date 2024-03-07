package decorator.beverage;

public abstract class Beverage {
    String description;

    public Beverage(String description) {
        this.description = description;
    }

    public abstract float cost();

    public String getDescription() {
        return description;
    }
}
