package behavioral.observer.StreamData;

public class MonHoc {
    String id, ten;
    int soTC;

    public MonHoc(String id, String ten, int soTC) {
        this.id = id;
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MonHoc{")
                .append("id='").append(id).append('\'')
                .append(", ten='").append(ten).append('\'')
                .append(", soTC=").append(soTC)
                .append('}');
        return builder.toString();
    }
}
