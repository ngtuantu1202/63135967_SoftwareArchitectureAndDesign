package behavioral.template_method.cafein_beverage;

public abstract class CaffeinBeverage63 {
    protected abstract void brew();
    protected abstract void addCondiment();
    private void boildWater(){
        System.out.println("Đun sôi nước ở 100 độ C");
    }
    private void pourInCup(){
        System.out.println("Rót thức uống ra cốc");
    }
    void prepareRecipe(){
        boildWater();
        brew();
        pourInCup();
        addCondiment();
    }
}
