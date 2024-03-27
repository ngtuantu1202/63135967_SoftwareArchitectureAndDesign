package creational.factory.Pizza2;

public class PizzaHawaii_HaiSan extends Pizza {
    @Override
    void prepare() {
        builder.append("Chuẩn bị nguyên liệu cho Pizza Hawaiii\n");
    }

    @Override
    void bake() {
        builder.append("Nướng Pizza Hawaiii\n");
    }

    @Override
    void cut() {
        builder.append("Cắt Pizza Hawaiii\n");
    }

    @Override
    void box() {
        builder.append("Đóng hộp Pizza Hawaiii\n");
    }
}
