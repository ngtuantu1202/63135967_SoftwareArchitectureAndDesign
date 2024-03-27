package creational.factory.Pizza2;

public class MainPizza {
    public static void main(String[] args) {
        // Tạo một Factory Pizza
        PizzaFactory vnfactory = new VN_PizzaFactory();
        PizzaFactory hawaiiFactory = new Haiwaii_PizzaFactory();

        // Đặt một loại Pizza Hawaii Hải sản
        Pizza hawaiiHaiSan = vnfactory.orderPizza(PizzaType.HAISAN);
        System.out.println("Đặt một Pizza Hawaii Hải sản: ");
        System.out.println(hawaiiHaiSan);

        // Đặt một loại Pizza Việt Nam Cay
        Pizza vnCay = vnfactory.orderPizza(PizzaType.CAY);
        System.out.println("\nĐặt một Pizza Việt Nam Cay: ");
        System.out.println(vnCay);
    }
}
