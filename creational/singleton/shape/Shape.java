package creational.singleton.shape;

public abstract class Shape {

    private String brush, paper, frame, shapeType;

    protected Shape(String shapeType, String brush, String paper, String frame) {
        this.shapeType = shapeType;
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    public abstract String draw();
    public String getBrush() {
        return brush;
    }
    public void setBrush(String brush) {
        this.brush = brush;
    }
    public String getPaper() {
        return paper;
    }
    public void setPaper(String paper) {
        this.paper = paper;
    }
    public String getFrame() {
        return frame;
    }
    public void setFrame(String frame) {
        this.frame = frame;
    }
    public String getShapeType() {
        return shapeType;
    }
    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }
}