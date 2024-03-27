package creational.factory.Pizza2;

public abstract class PizzaFactory {
    abstract Pizza createPizza(PizzaType p);
    public Pizza orderPizza(PizzaType p)
    {
        Pizza pizza = createPizza(p);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

}
