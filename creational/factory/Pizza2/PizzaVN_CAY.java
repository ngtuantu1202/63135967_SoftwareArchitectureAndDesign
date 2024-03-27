package creational.factory.Pizza2;

public class PizzaVN_CAY extends Pizza{
    @Override
    void prepare() {
        builder.append("Chuẩn bị nguyên liệu cho Pizza Việt Nam\n");
    }

    @Override
    void bake() {
        builder.append("Nướng Pizza Việt Nam\n");
    }

    @Override
    void cut() {
        builder.append("Cắt Pizza Việt Nam\n");
    }

    @Override
    void box() {
        builder.append("Đóng hộp Pizza Việt Nam\n");
    }
}
