package decorator.bieuthuc;

public class BieuThucDecorator extends BieuThuc{
    public BieuThucDecorator(String bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        return 0;
    }
    @Override
    public String getBieuThuc() {
        return super.getBieuThuc();
    }
    @Override
    public String toString() {
        return getBieuThuc() + "=" + giaTri();
    }

}
