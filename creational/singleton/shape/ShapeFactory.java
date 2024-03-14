package creational.singleton.shape;

public class ShapeFactory {
    public static Shape createShape(ShapeType shapeType, String brush, String paper, String frame) {
        Shape shape = null;
        switch (shapeType) {
            case RECTANGLE:
                shape = Rectangle.getInstance(brush, paper, frame);
                break;
            case TRIANGLE:
                shape = Triangle.getInstance(brush, paper, frame);
                break;
            case CIRCLE:
                shape = Circle.getInstance(brush, paper, frame);
                break;
            default:
                throw new IllegalArgumentException("Hình ko hợp lệ: " + shapeType);
        }
        return shape;
    }
}
