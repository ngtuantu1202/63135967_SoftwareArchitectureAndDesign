package structural.composite.file;

public class File extends AbstractFile{
    public File(String ten, String ngayTao, String duongDan) {
        super(ten, ngayTao, duongDan);
    }

    @Override
    public void add(AbstractFile f) {

    }
    @Override
    public void remove(AbstractFile f) {

    }
    @Override
    public String getStringTreeFolder() {
        return ten;
    }
}
