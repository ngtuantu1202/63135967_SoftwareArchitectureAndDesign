package creational.factory.viduPizza;

import creational.factory.viduPizza.Pizza63;
import creational.factory.viduPizza.PizzaStore;
import creational.factory.viduPizza.PizzaType;
import creational.factory.viduPizza.VN_HaiSanPizza;

public class VN_PizzaStore extends PizzaStore {
    @Override
    Pizza63 createPizza(PizzaType p) {
        switch (p)
        {
            case HAISAN -> {return new VN_HaiSanPizza();}
        }
        return null;
    }
}
