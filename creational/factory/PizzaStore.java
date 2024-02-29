package creational.factory;

public abstract class PizzaStore {
    abstract Pizza63 createPizza(PizzaType p);
    public Pizza63 orderPizza(PizzaType p){
        Pizza63 pizza = createPizza(p);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
