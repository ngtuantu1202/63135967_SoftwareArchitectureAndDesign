package creational.singleton.shape;

public class Circle extends Shape {
    private static Circle instance;
    private Circle(String brush, String paper, String frame) {
        super("Circle", brush, paper, frame);
    }

    public static Circle getInstance(String brush, String paper, String frame) {
        if (instance == null) {
            instance = new Circle(brush, paper, frame);
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Vẽ một hình tròn với " + getBrush() + " trên " + getPaper() + " trong khung " + getFrame() + ".";
    }
}