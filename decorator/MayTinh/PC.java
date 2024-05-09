package decorator.MayTinh;

public abstract class PC {
    String mainboard, cpu, ram, storage, screen;
    int VMainboard, VCpu, VRam, VStorage, VScreen;

    abstract public String build();

    abstract public int value();

    public String getMainboard() {
        return mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public int getVMainboard() {
        return VMainboard;
    }

    public int getVCpu() {
        return VCpu;
    }

    public int getVRam() {
        return VRam;
    }

    public int getVStorage() {
        return VStorage;
    }

    public int getVScreen() {
        return VScreen;
    }
}
