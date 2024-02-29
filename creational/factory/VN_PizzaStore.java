package creational.factory;

public class VN_PizzaStore extends PizzaStore{
    @Override
    Pizza63 createPizza(PizzaType p) {
        switch (p)
        {
            case HAISAN -> {return new VN_HaiSanPizza();}
        }
        return null;
    }
}
