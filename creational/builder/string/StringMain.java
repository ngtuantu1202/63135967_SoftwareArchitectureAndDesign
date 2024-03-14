package creational.builder.string;

public class StringMain {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();

        builder.addString("Hi ")
                .addFloat(10.0f)
                .addString("is my ")
                .addBool(true)
                .addString("point");

        System.out.println(builder.toString());
    }
}
