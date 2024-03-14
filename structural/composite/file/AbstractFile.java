package structural.composite.file;

public abstract class AbstractFile {
    String ten, ngayTao, duongDan;

    public AbstractFile(String ten, String ngayTao, String duongDan) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }

    public abstract void add(AbstractFile f);
    public abstract void remove(AbstractFile f);
    public abstract String getStringTreeFolder();
    public String getPath()
    {
        return duongDan;
    }

}
