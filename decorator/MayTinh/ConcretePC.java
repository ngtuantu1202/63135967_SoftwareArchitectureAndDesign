package decorator.MayTinh;

public class ConcretePC extends PC {
    public ConcretePC(String mainboard, String cpu, String ram, String storage, String screen, int VMainboard, int VCpu, int VRam, int VStorage) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.VMainboard = VMainboard;
        this.VCpu = VCpu;
        this.VRam = VRam;
        this.VStorage = VStorage;
        this.VScreen = VScreen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mainboard: " + mainboard + "\n")
                .append("CPU: " + cpu + "\n")
                .append("RAM: " + ram + "\n")
                .append("Storage: " + storage + "\n")
                .append("Screen: " + screen + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return VMainboard +VCpu+VRam+VStorage+VScreen;
    }
}
