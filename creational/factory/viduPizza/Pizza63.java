package creational.factory.viduPizza;

public abstract class Pizza63 {
    StringBuilder builder = new StringBuilder();
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();

    @Override
    public String toString() {
        return builder.toString();
    }
}
