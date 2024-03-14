package creational.singleton.shape;

public class Rectangle extends Shape {
    private static Rectangle instance;
    private Rectangle(String brush, String paper, String frame) {
        super("Rectangle", brush, paper, frame);
    }
    public static Rectangle getInstance(String brush, String paper, String frame) {
        if (instance == null) {
            instance = new Rectangle(brush, paper, frame);
        }
        return instance;
    }
    @Override
    public String draw() {
        return "Vẽ một hình chữ nhật với " + getBrush() + " trên " + getPaper() + " trong khung " + getFrame() + ".";
    }
}