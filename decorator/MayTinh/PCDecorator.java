package decorator.MayTinh;

public abstract class PCDecorator extends PC {
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    public String getMainboard() {
        return pc.getMainboard();
    }

    @Override
    public String getCpu() {
        return pc.getCpu();
    }

    @Override
    public String getRam() {
        return pc.getRam();
    }

    @Override
    public String getStorage() {
        return pc.getStorage();
    }

    @Override
    public String getScreen() {
        return pc.getScreen();
    }

    @Override
    public int getVMainboard() {
        return pc.getVMainboard();
    }

    @Override
    public int getVCpu() {
        return pc.getVCpu();
    }

    @Override
    public int getVRam() {
        return pc.getVRam();
    }

    @Override
    public int getVStorage() {
        return pc.getVStorage();
    }

    @Override
    public int getVScreen() {
        return pc.getVScreen();
    }
}
