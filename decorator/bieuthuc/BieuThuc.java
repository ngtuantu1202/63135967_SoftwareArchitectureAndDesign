package decorator.bieuthuc;

public abstract class BieuThuc {
    String bieuThuc;
    public BieuThuc(String bieuThuc) {
        this.bieuThuc = bieuThuc;
    }
    public abstract float giaTri();

    public String getBieuThuc() {
        return bieuThuc;
    }
}
