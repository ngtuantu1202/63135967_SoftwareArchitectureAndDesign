package creational.builder.string;

public class MyStringBuilder {
    String str;

    public MyStringBuilder() {
        this.str = "";
    }
    public MyStringBuilder addString(String s) {
        this.str += s;
        return this;
    }
    public MyStringBuilder addFloat(float f) {
        this.str += Float.toString(f);
        return this;
    }
    public MyStringBuilder addBool(boolean b) {
        this.str += Boolean.toString(b);
        return this;
    }
    public String toString() {
        return this.str;
    }
}