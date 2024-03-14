package creational.singleton.shape;

public class MainShape {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE, "bút chì", "giấy A4", "khung nhữa");
        Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE, "bút bi", "giấy vở", "kuhg gỗ");
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE, "bút màu", "giấy trắng", "khung vàng");

        System.out.println(circle.draw());
        System.out.println(rectangle.draw());
        System.out.println(triangle.draw());

    }
}
