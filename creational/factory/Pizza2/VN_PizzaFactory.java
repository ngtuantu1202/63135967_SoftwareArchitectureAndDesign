package creational.factory.Pizza2;

public class VN_PizzaFactory extends PizzaFactory{
    @Override
    Pizza createPizza(PizzaType p) {
        switch (p) {
            case HAISAN:
                return new PizzaHawaii_HaiSan();
            case CAY:
                return new PizzaVN_CAY();
            default:
                return null;
        }
    }
}
