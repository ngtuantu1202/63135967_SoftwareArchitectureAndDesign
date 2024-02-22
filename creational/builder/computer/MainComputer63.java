package creational.builder.computer;

public class MainComputer63 {
    public static void main(String[] args) {
        Computer63 computer = new Computer63.Builder()
                .buildCPU("Intel i5")
                .buildRAM("16GB")
                .buildStorage("500GB")
                .buildScreen("17 inch")
                .build();
        System.out.println(computer.toString());
    }
}
