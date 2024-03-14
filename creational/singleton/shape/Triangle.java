package creational.singleton.shape;

public class Triangle extends Shape {
    private static Triangle instance;
    private Triangle(String brush, String paper, String frame) {
        super("Triangle", brush, paper, frame);
    }
    public static Triangle getInstance(String brush, String paper, String frame) {
        if (instance == null) {
            instance = new Triangle(brush, paper, frame);
        }
        return instance;
    }
    @Override
    public String draw() {
        return "Vẽ một tam giác với " + getBrush() + " trên " + getPaper() + " trong khung " + getFrame() + ".";
    }
}