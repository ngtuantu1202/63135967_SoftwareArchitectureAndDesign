package behavioral.template_method.cafein_beverage;

public class Coffee extends CaffeinBeverage63{

    @Override
    protected void brew() {
        System.out.println("Cho bột caffee vào nước sôi và khuấy");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Cho sửa vào rồi tưởng thức");
    }
}
