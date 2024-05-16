package behavioral.observer.Topic;

public class TinTuc {
    private int id;
    private String title;
    private String content;

    public TinTuc(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nID:").append(id)
                .append(" Tiêu đề :").append(title)
                .append(" Nội dung :").append(content);
        return builder.toString();
    }
}
